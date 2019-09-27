
var app = (()=>{
	return {
		init : (ctx)=>{
			$('#login_form').submit(()=>{
				alert('login_form 클릭');
			});
			$('#a_join').click(()=>{
				alert('회원가입 화면으로 이동');
				location.assign(ctx+'/player.do?action=move&page=join');
			});
			$('#a_back').click(()=>{
				alert('로그인 화면으로 이동');
				location.assign(ctx+'/player.do?action=move&page=login');
			});
		}
	};
})();