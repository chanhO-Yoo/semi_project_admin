<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
        
	    <!-- third line -->
	    <nav id="header-second" class="line-style-notop">
	    	<ul class="list-unstyled list-inline">
	            <li><a href="<%= request.getContextPath()%>/admin/searchMember">회원관리</a></li>
	            <li><a href="<%= request.getContextPath()%>/admin/searchQna">1:1문의관리</a></li>
	        </ul>
	    </nav>
	
	</header>
	
	    <div>회원관리!</div>

    


</body>
</html>