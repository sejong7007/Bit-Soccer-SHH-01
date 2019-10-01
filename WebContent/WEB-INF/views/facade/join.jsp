<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../common/head.jsp"/>




<div></div>
<div>
<h2>회원가입화면</h2>
</div>
<div></div>
<div></div>
<div>
<form id="join_form">

	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="playerId" /></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="playerName" /></td>
		</tr>
		<tr>
			<td>팀 이름</td>
			<td><input type="text" name="teamId" /></td>
		</tr>
		<tr>
			<td>영문팀명</td>
			<td><input type="text" name="ePlayerName" /></td>
		</tr>
		<tr>
			<td>닉네임</td>
			<td><input type="text" name="nickname" /></td>
		</tr>
		<tr>
			<td>가입연도</td>
			<td><input type="text" name="joinYyyy" /></td>
		</tr>
		<tr>
			<td>포지션</td>
			<td><input type="text" name="position" /></td>
		</tr>
		<tr>
			<td>백넘버</td>
			<td><input type="text" name="backNo" /></td>
		</tr>
		<tr>
			<td>국적</td>
			<td><input type="text" name="nation" /></td>
		</tr>
		<tr>
			<td>생일</td>
			<td><input type="text" name="birthDate" /></td>
		</tr>
		<tr>
			<td>솔라</td>
			<td><input type="text" name="solar" /></td>
		</tr>
		<tr>
			<td>키(cm)</td>
			<td><input type="text" name="height" /></td>
		</tr>
		<tr>
			<td>몸무게(kg)</td>
			<td><input type="text" name="weight" /></td>
		</tr>
	</table>
	<input type="hidden" name="action" value="join" />
    <input type="hidden" name="page" value="login" />
</form>
</div>
<div></div>
<div></div>
<div>
	<h3><a id="a_join" herf="#">회원가입</a></h3>
</div>
<div>
	<h3><a id="a_back" href="#">뒤로가기</a></h3>
</div>





<script>
app.init('${ctx}');
</script>


<jsp:include page="../common/foot.jsp"/>

