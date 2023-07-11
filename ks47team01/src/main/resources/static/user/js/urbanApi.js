/**
 *  어반팜에 사용되는 API만 포함됩니다.
 */

// 결제창 주소찾기 클릭시 api
// ks47team01\src\main\resources\templates\user_shop_payment\shop_payment_main.html
window.onload = function() {
	document.getElementById("payment_addr_find").addEventListener("click", function() { //주소입력칸을 클릭하면
		//카카오 지도 발생
		new daum.Postcode({
			oncomplete: function(data) { //선택시 입력값 세팅
				document.getElementById("payment_addr").value = data.address; // 주소 넣기
				document.querySelector("input[name=payment_addr_detail]").focus(); //상세입력 포커싱
			}
		}).open();
	});
}

// 토스 페이먼트 결제 API
// ks47team01\src\main\resources\templates\user_shop_payment\shop_payment_main.html
const clientKey = "test_ck_ODnyRpQWGrNnd71NEqbrKwv1M9EN"
const customerKey = "Hm146hHaSWCNoqGKNucJJ" // 내 상점에서 고객을 구분하기 위해 발급한 고객의 고유 ID
const button = document.getElementById("toss_payment")
// ------  결제위젯 초기화 ------ 
// 비회원 결제에는 customerKey 대신 ANONYMOUS를 사용하세요.
const paymentWidget = PaymentWidget(clientKey, customerKey) // 회원 결제
// const paymentWidget = PaymentWidget(clientKey, PaymentWidget.ANONYMOUS) // 비회원 결제

// ------  결제위젯 렌더링 ------ 
// 결제수단 UI를 렌더링할 위치를 지정합니다. `#payment-method`와 같은 CSS 선택자와 결제 금액 객체를 추가하세요.
// https://docs.tosspayments.com/reference/widget-sdk#renderpaymentmethods선택자-결제-금액-옵션
paymentWidget.renderPaymentMethods("#payment-method", { value: 1000000000 })

// ------  이용약관 렌더링 ------
// 이용약관 UI를 렌더링할 위치를 지정합니다. `#agreement`와 같은 CSS 선택자를 추가하세요.
// https://docs.tosspayments.com/reference/widget-sdk#renderagreement선택자
paymentWidget.renderAgreement('#agreement')

// ------ '결제하기' 버튼 누르면 결제창 띄우기 ------
// 더 많은 결제 정보 파라미터는 결제위젯 SDK에서 확인하세요.
// https://docs.tosspayments.com/reference/widget-sdk#requestpayment결제-정보
button.addEventListener("click", function() {
	paymentWidget.requestPayment({
		orderId: "mg4ctn_qNSxuTAjMVHxBv",            // 주문 ID(직접 만들어주세요)
		orderName: "어반팜 딸기 키트 - 초급자용",           // 주문명
		successUrl: "http://192.168.10.24:80/userPayment/userPaymentSuccess",  			// 결제에 성공하면 이동하는 페이지(직접 만들어주세요)
		failUrl: "http://192.168.10.24:80/userPayment/userPaymentFail",										// 결제에 실패하면 이동하는 페이지(직접 만들어주세요)
		amount: "1000000000",
		customerEmail: "customer123@gmail.com",
		customerName: "김토스"
	})
});