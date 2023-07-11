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
// default
$('#urbanfarm_scroll_up').click(function(e) {
	e.preventDefault();
	$('html, body').animate({ scrollTop: 0 }, 'fast');
});

// 스크롤 fade-in, fade-out 애니메이션
// default
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
// ks47team01\src\main\resources\templates\user_shop\shop_detail.html
if($('#urban-cart-click').length > 0){
	$('#urban-cart-click').click(function(e) {
		if (confirm('상품이 장바구니에 담겼습니다. 장바구니로 이동하시겠습니까?') == true) {
			alert("장바구니로 이동합니다");
		} else {
			alert("장바구니로 이동하지 않습니다.");
			e.preventDefault();
		}
	});
}

// 팝업창 닫기 종합
// ks47team01\src\main\resources\templates\user_order\order_processing.html
if($('.windowClose').length > 0){
	function closePopUp() {
	    console.log('창닫기');
	    window.close();
	}
	$('.windowClose').on('click', closePopUp);
}


// 주문상세 페이지에서 주문상세 버튼 클릭시 팝업
// ks47team01\src\main\resources\templates\user_order\order_main.html
if($('.orderDetailBtn').length > 0){
	function orderDetail() {
	    let width = 1200;
	    let height = 1000;
	
	    let left = (window.screen.width/2) - (width/2);
	    let top = (window.screen.height/4);
	
	    let windowStatus = 'width='+width+', height='+height+', left='+left+', top='+top+', scrollbars=yes, status=no, resizable=no, titlebar=no, location=no, toolbar=no, menubar=no';
	
	    const url = "userOrderDetail";
	
	    window.open(url, "주문상세", windowStatus);
	}
	$('.orderDetailBtn').on('click', orderDetail);
}

// 주문상세 페이지에서 교환, 반품, 취소신청튼 클릭시 팝업
// ks47team01\src\main\resources\templates\user_order\order_main.html
if($('.orderProcessingBtn').length > 0){
	function orderProcessing() {
		let originalInnerText = $(this).text();
		
		console.log(originalInnerText);
		
		$.ajax({
			url: "/userOrder/userOrderProcessingText",
			data: { innerText : originalInnerText },
			type: "POST",
			success : function(response){
				let width = 600;
				let height = 600;
			
				let left = (window.screen.width/2) - (width/2);
				let top = (window.screen.height/4);
			
				let windowStatus = 'width='+width+', height='+height+', left='+left+', top='+top+', scrollbars=yes, status=no, resizable=no, titlebar=no, location=no, toolbar=no, menubar=no';
				
				// URL에 innerText 값을 추가합니다.
				const url = "/userOrder/userOrderProcessing?" + response;
			
				window.open(url, "신청", windowStatus);
			},
			error : function(){
				alert("에러가 발생했습니다. 시스템 관리자에게 문의하세요.");
			} 
		});
	}
	
	$('.orderProcessingBtn').on('click', orderProcessing);
}


// 신청하기 버튼
// ks47team01\src\main\resources\templates\user_order\order_processing.html
if($('.orderProcessingSubmit').length > 0){
	function orderProcessingSubmit() {
		alert('신청이 완료되었습니다.');
		window.close();
	}
	
	$('.orderProcessingSubmit').on('click', orderProcessingSubmit);
}