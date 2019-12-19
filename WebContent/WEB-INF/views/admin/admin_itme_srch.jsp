<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
        
              
	    <!-- 3 line -->
	    <nav id="header-second" class="line-style-notop">
	    	<ul class="list-unstyled list-inline">
	        	<li><a href="<%= request.getContextPath()%>/admin/enrollProduct">상품등록</a></li>
	            <li><a href="<%= request.getContextPath()%>/admin/searchProduct">상품조회</a></li>
	            <li><a href="<%= request.getContextPath()%>/admin/searchProductReview">이용후기 관리</a></li>
	        </ul>
	    </nav>
	</header>

    <div>상품조회 !!!!!! 페이지 !</div>
    

</body>
</html>