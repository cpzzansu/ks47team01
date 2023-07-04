// /**
//  *
//  */
//
// document.addEventListener('DOMContentLoaded', function() {
//     const $insertMemberPw = document.getElementById('insert_member_pw');
//     const $insertMemberPwCheck = document.getElementById('insert_member_pw_check');
//     const $insertMemberSubmitButton = document.getElementById('insert_member_submit_button');
//     const $member_update_pw_button = document.getElementById('member_update_pw_button');
//
//     $insertMemberPw.addEventListener('input', checkPasswordMatch);
//     $insertMemberPwCheck.addEventListener('input', checkPasswordMatch);
//
//     function checkPasswordMatch() {
//       var password = $insertMemberPw.value;
//       var PasswordCheck = $insertMemberPwCheck.value;
//       var errorMessage = document.getElementById('error_message');
//
//       if (password !== PasswordCheck) {
//         errorMessage.textContent = '비밀번호가 일치하지 않습니다.';
//         $insertMemberPwCheck.classList.add('error');
//         $("#member_update_pw_button").prop("disabled", true);
//       } else {
//         errorMessage.textContent = '';
//         $insertMemberPwCheck.classList.remove('error');
//         $("#member_update_pw_button").prop("disabled", false);
//       }
//     }
//     $member_update_pw_button.addEventListener('click', function() {
//        console.log(checkPasswordMatch());
//         if(checkPasswordMatch()) $("#member_update_pw_button").submit;
//     })
//
//     $insertMemberSubmitButton.addEventListener('click', function(event) {
//       if (!$insertMemberPwCheck.checkValidity()) {
//         event.preventDefault();
//         alert('비밀번호가 일치하지 않습니다.');
//       }
//     });
//   });
//
// $(document).ready(function() {
// 	$("#member_name").blur(function(event){
// 		const member_name = $("#member_name").val();
// 		$("#name_error_message").css('color', 'red');
// 		if(member_name == ""){
// 			$("#name_error_message").text('이름을 입력하세요.');
// 			return;
// 		}
// 	})
// })
//
// $(document).ready(function() {
// 	$("#member_id").blur(function(event) {
// 		event.preventDefault();
//
// 		const member_id = $("#member_id").val();
//
// 		console.log(member_id);
// 		$('#id_error_message').css('color', 'red');
// 		if(member_id == ""){
// 			$('#id_error_message').text('아이디를 입력하세요.');
// 			isIdChecked = false
// 			return;
// 		}
//
// 	    const idLength = member_id.length;
// 		console.log(idLength);
//
// 	    if(idLength > 15) {
// 			$('#id_error_message').text("아이디는 15자 이내로 이루어져야 합니다.");
// 			isIdChecked = false
// 			return;
// 		}
//
// 	    const isAlphaNumeric = /^[a-zA-Z0-9]+$/.test(member_id);
//
// 	    if (!isAlphaNumeric) {
// 	      $('#id_error_message').text("아이디는 영어와 숫자로만 이루어져야 합니다.");
// 	      isIdChecked = false
// 	      return;
// 	    }
//
//
// 		console.log(member_id);
// 		if(member_id.trim() !== "") {
// 			$.ajax({
// 				url: "/urbanfarm01/Min/member_insert_id_check.urbanfarm_m",
// 				method: "post",
// 				data: { member_id: member_id },
// 				success: function(response) {
// 					console.log("응답 받음:", response);
// 					if(response === "available"){
// 						sessionStorage.setItem("member_idAvailable", true);
// 						$('#id_error_message').css('color', 'green');
// 						$('#id_error_message').text('사용 가능한 아이디입니다.');
// 						//alert("사용 가능한 아이디입니다.")
// 						isIdChecked = true;
//
// 					} else{
// 						//alert("이미 사용 중인 아이디입니다.");
// 						$('#id_error_message').text('이미 사용중인 아이디입니다.');
// 						isIdChecked = false;
// 					}
// 				},
// 				error: function(xhr, status, error) {
// 					console.log("에러 발생:", error);
// 				}
// 			})
// 		}
// 	})
// })
//
//
//
// $(document).ready(function() {
// 	$("#member_phone").blur(function(event) {
// 		event.preventDefault();
// 		console.log('dmd');
// 		const member_phone = $("#member_phone").val();
// 		$('#phone_error_message').css('color', 'red');
// 				if(member_phone == ""){
// 			$("#phone_error_message").text('이름을 입력하세요.');
//
// 		}
// 		let regex = /^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$/;
// 		let isPhone = regex.test(member_phone);
// 		if(!isPhone){
// 		$('#phone_error_message').text("잘못된 형식의 전화번호입니다.");
// 		return;
// 		}
// 	})
// })
//
// $(document).ready(function() {
// 	$("#member_email").blur(function(event) {
// 		event.preventDefault();
//
// 		const member_email = $("#member_email").val();
// 		$('#email_error_message').css('color', 'red');
// 		let regex = new RegExp("([!#-'*+/-9=?A-Z^-~-]+(\.[!#-'*+/-9=?A-Z^-~-]+)*|\"\(\[\]!#-[^-~ \t]|(\\[\t -~]))+\")@([!#-'*+/-9=?A-Z^-~-]+(\.[!#-'*+/-9=?A-Z^-~-]+)*|\[[\t -Z^-~]*])");
// 		let isEmailAddress = regex.test(member_email);
// 		if(!isEmailAddress){
// 		$('#email_error_message').text("잘못된 형식의 이메일 주소입니다.");
// 		isEmailChecked = false
// 		return;
// 		}
//
//
// 		console.log(member_email);
// 		if(member_email.trim() !== "") {
// 			$.ajax({
// 				url: "/urbanfarm01/Min/member_insert_email_check.urbanfarm_m",
// 				method: "post",
// 				data: { member_email: member_email },
// 				success: function(response) {
// 					console.log("응답 받음:", response);
// 					if(response === "available"){
// 						sessionStorage.setItem("member_emailAvailable", true);
// 						$('#email_error_message').css('color', 'green');
// 						$('#email_error_message').text("사용 가능한 이메일입니다.");
// 						$("#insert_member_submit_button").prop("disabled", false);
// 						isEmailChecked = true;
// 					} else{
// 						$('#email_error_message').text("이미 사용 중인 이메일입니다.");
// 						isEmailChecked = false;
// 					}
// 				},
// 				error: function(xhr, status, error) {
// 					console.log("에러 발생:", error);
// 				}
// 			})
//
// 		}
// 	})
// })
//
//   $("#insert_member_submit_button").click(function(event){
// 	  event.preventDefault();
//       const member_idAvailable = sessionStorage.getItem("member_idAvailable");
//       const member_emailAvailable = sessionStorage.getItem("member_emailAvailable");
//       console.log(member_idAvailable === "true" && member_emailAvailable === "true");
//       if (isIdChecked === true && isEmailChecked === true){
//           $("#memberInsertForm").submit();
//       } else {
//           alert('아이디와 이메일을 체크해주세요.₩');
//       }
//   })
//
//   //아이디 비밀번호 찾기
//   //승인번호 이메일 전송
//
//   $(document).ready(function() {
//       $("#email-send-btn").click(function(event){
//           event.preventDefault();
//           const find_email = $("#find_email").val();
//
//           console.log(find_email);
//           if(find_email.trim() !== ""){
//               $.ajax({
//                   url: "/urbanfarm01/Mfind/member_find_id_pw_action.urbanfarm_m",
//                   method: "post",
//                   data: { find_email: find_email },
//                   success: function(response){
//                       console.log('응답 받음:', response);
//                       if(response !== null){
//                           console.log(typeof(response));
//                           sessionStorage.setItem("verificationCode", response);
//                           console.log(sessionStorage.getItem("verificationCode"));
//                           alert("인증번호를 이메일로 보냈습니다. 인증번호를 입력하세요.");
//
//                       }else{
//
//                       }
//                   },
//                   error: function(xhr, status, error){
//                       console.log('에러 발생:', error);
//                   }
//               })
//           }
//       })
//   })
//
//   $("#verificationCode").input(function(event){
// 	  event.preventDefault();
//       let $verificationCode = $("#verificationCode").val();
//       let verificationCode = sessionStorage.getItem("verificationCode");
//
//       if ($verificationCode && verificationCode){
//           $("#member-id-pw-find-btn").prop("disabled", false);
//       } else {
//
//       }
//   })
//
// 스크롤 올라가는 애니메이션
$('#urbanfarm_scroll_up').click(function(e) {
	e.preventDefault();
	$('html, body').animate({ scrollTop: 0 }, 'fast');
});

// 스크롤 fade-in, fade-out 애니메이션
$(window).scroll(function() {
	$('#urban_scroll_fadein').each(function(i) {

		let scrollTop = $(window).scrollTop();
		let height = $(window).height();

		if (scrollTop > height) {
			$(this).stop().animate({ 'opacity': '1' }, 700);
		} else if (scrollTop < 100) {
			$(this).stop().animate({ 'opacity': '0' }, 700);
		}
	});
});

// 장바구니 클릭시 팝업
$('#urban-cart-click').click(function(e) {
	if (confirm('상품이 장바구니에 담겼습니다. 장바구니로 이동하시겠습니까?') == true) {
		alert("장바구니로 이동합니다");
	} else {
		alert("장바구니로 이동하지 않습니다.");
		e.preventDefault();
	}
});

// 결제창 주소찾기 클릭시 api
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

// 결제창 토스페이먼트 api
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
		successUrl: "http://192.168.10.24:80/Ushop/user_shop_payment_success",  			// 결제에 성공하면 이동하는 페이지(직접 만들어주세요)
		failUrl: "http://192.168.10.24:80/Ushop/user_shop_payment_fail",										// 결제에 실패하면 이동하는 페이지(직접 만들어주세요)
		amount: "1000000000",
		customerEmail: "customer123@gmail.com",
		customerName: "김토스"
	})
});
