<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../common/head.jsp"/>

<img src="${img}/soccer_intro.jpg" style="width:100%; height:500px; alt="" />
<h2 style="width:400px; margin:100px auto">축구협회관리시스템</h2>
      <form id="login_form">
            <table border="1" style="width:300px; height:200px; margin:300px auto">
                  <tr>
                        <td style="width:300px">
                              ID : <input type="text" name="playerId" style="width:100%" />
                        </td>
                        <td rowspan="2">
                        <input type="submit" id="btn" value="로그인" style="width:100%; height:100%"/>
                        </td>
                  </tr>
                  <tr>
                        <td>
                              PW : <input type="text" name="solar" style="width:100%" />
                        </td>
                  </tr>
            </table>
      <input type="hidden" name="action" value="login" />
      <input type="hidden" name="page" value="home" />
      </form>
      
      
      <h3 style="width:100px; margin:100px auto">
            <a id="a_join" href="#">회원가입</a>
      </h3> 
<jsp:include page="../common/foot.jsp"/>

<script>
app.init('${ctx}');
</script>
