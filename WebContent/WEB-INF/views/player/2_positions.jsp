<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="test_form">

<div></div>
<div>
	<h2><a id="2_p" href="#">2. 포지션 종류 보기</a></h2>
</div>
<div>
	<h2>4. 팀 포지션별 선수조회</h2><br />
	<form id="4_f_q" >
		<table border =1>
			<tr>
				<td>
				팀 ID <br />
				포지션 
				<input type="hidden" name="action" value="search"/>
				<input type="hidden" name="page" value="4_f_a"/>
				</td>
				<td>
				<input id="search_4_id" type="text" /><br />
   			    <input id="search_4_position" type="text" />
				</td>
				<td><input id="4_f_q_move" type="button" value="조회" /></td>
			</tr>
		</table>
	</form>
</div>
<div></div>
<div>
	<h2><a id="5_f" href="#">5. 키, 몸무게 조건별 선수 검색</a></h2>
</div>
<div></div>

</div>

<script>
app.init('${ctx}');
</script>