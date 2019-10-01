
var app = (()=>{
	return {
		init : (ctx)=>{
			playerService.login();
			$('#login_btn').click(()=>{
				
				/*
				 * 
				 if(){
					alert('필수값을 입력해 주세요.');
				}else{
					$('#login_form').submit(()=>{
						alert('login_form 클릭');
					});		
				}
				*/
				
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

var player = (()=>{
	var _playerId, _playerName, _teamId, _ePlayerName, _nickname, _joinYyyy
		,_position , _backNo, _nation, _birthDate, _solar, _height, _weight;
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar;}
	return {
		setPlayerId : setPlayerId,
		setSolar : setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar
	};
})();

var playerService = (()=>{
	return {
		login: ()=>{
			$('#login_btn').click(()=>{
				if($('#username').val()==='' || $('#password').val()===''){
					alert('필수값이 없습니다.')
				}else{
					alert('입력한 아이디 값 : '+ $('#username').val()
							+'  비밀번호 : ' + $('#password').val());
					$('#login_form').attr('action','/jee-soccer/player.do');
					$('#login_form').submit();
				}
				
			});
		}
	};
})();



