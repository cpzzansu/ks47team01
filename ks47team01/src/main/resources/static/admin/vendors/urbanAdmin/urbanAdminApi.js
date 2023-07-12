window.onload = function() {
    document.getElementById("payment_addr_find").addEventListener("click", function(e) { //주소입력칸을 클릭하면
        e.preventDefault();
        //카카오 지도 발생
        var width = 500; //팝업의 너비
        var height = 600; //팝업의 높이
        new daum.Postcode({
            oncomplete: function(data) { //선택시 입력값 세팅
                document.getElementById("payment_addr").value = data.address; // 주소 넣기
                document.querySelector("input[name=payment_addr_detail]").focus(); //상세입력 포커싱
            }
        }).open({
            left: Math.ceil(( window.screen.width - width )/2),
            top: Math.ceil(( window.screen.height - height )/2)
        });
    });
}
