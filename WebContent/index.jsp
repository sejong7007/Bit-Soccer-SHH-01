<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<img src="<%=request.getContextPath()%>/resources/img/loading2.gif" alt="" />
<script>

location.assign('<%=request.getContextPath()%>/facade.do');

</script>