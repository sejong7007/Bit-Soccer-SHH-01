<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../common/head.jsp"/>

<div></div>
<div>
	<img id="soccer_intro" src="${img}/soccer_intro.jpg" alt="" />
</div>
<div></div>
<div>

</div>
<div>
	<form id="login_form">
            <table id="login_tab">
                  <tr>
                        <td>
                              ID : <input id="username" class="input_text" type="text" name="playerId"/>
                        </td>
                        <td rowspan="2">
                        <input id="login_btn" type="button" value="로그인"/>
                        </td>
                  </tr>
                  <tr>
                        <td>
                              PW : <input id="password" class="input_text" type="text" name="solar" />
                        </td>
                  </tr>
            </table>
      <input type="hidden" name="action" value="login" />
      <input type="hidden" name="page" value="home" />
	</form>
</div>
<div></div>
<div></div>
<div>
	<h3 id="join_a">
            <a id="a_join" href="#">회원가입</a>
    </h3> 
</div>
<div></div>
<jsp:include page="../common/foot.jsp"/>



<script>
app.init('${ctx}');
</script>


