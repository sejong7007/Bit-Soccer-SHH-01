<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<jsp:include page="../common/head.jsp"/>
    

<c:choose>
	<c:when test="${page eq '2_positions'}">
		<jsp:include page="2_positions.jsp"/>	
	</c:when>
	<c:when test="${page eq '2_positions_answer'}">
		<jsp:include page="2_positions_answer.jsp"/>
	</c:when>
</c:choose>



<jsp:include page="../common/foot.jsp"/>