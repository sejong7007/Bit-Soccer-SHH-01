<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<img src="<%=request.getContextPath()%>/resources/img/loading2.gif" alt="" />
<script>

location.assign('<%=request.getContextPath()%>/facade.do');

</script>