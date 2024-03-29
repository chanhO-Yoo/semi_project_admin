<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>re:flex</title>
    <link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet"> <!-- 부트스트랩 -->
    <link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet">
   
    <script src="<%=request.getContextPath() %>/js/jquery-3.4.1.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/js/header.js"></script>
</head>
<body>
    
        <header class="container-fluid navbar-fixed-top">
            
                <!-- first line -->
                <div id="header-first" class="row">
                    <div id="logo" class="col-md-4">
                        <h1><a href="<%=request.getContextPath() %>">re:flex</a></h1>
                    </div>
                    <div id="search" class="col-md-4">
                        <h2 class="sr-only">상품 검색</h2>
                        <form action="">
                            <button type="submit" id="btn-search" aria-label="search products">
                                <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
                            </button>
                            <input type="search" name="search" placeholder="검색">
                        </form>
                    </div>
                    <div id="header-first-menu" class="col-md-4">
                        <ul class="list-unstyled list-inline text-right">
                            <li><a href="#">관리인</a></li>
                            <li>
                                <h2 class="sr-only">장바구니</h2>
                                <a href="#" aria-label="cart"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
                            </li>
                        </ul>
                        <!-- side menu -->
                        <div>
                            <h2 class="sr-only">사이드메뉴</h2>
                            <button type="button"  id="btn-sidemenu">
                                <span class="glyphicon glyphicon-list" aria-hidden="true"></span>
                            </button>
                            <ul id="level1-sidemenu" class="list-unstyled sidemenu">
                                <li></li>
                                <li id="recommended" data-target="#level2-recommended"><a href="#">이럴 때 빌려봐<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">패션<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">뷰티<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">리빙<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">키즈<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">레저<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">고객서비스</a></li>
                            </ul>
                            <ul id="level2-recommended" class="list-unstyled sidemenu">
                                <li class="go-back text-center"><a href="#"><span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>이럴 때 빌려봐</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                                <li><a href="#">바캉스 갈 때</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
        
               <!-- second line -->
               <nav id="header-second" class="line-style">
                    <h2 class="sr-only">메인메뉴</h2>
                    <ul class="list-unstyled list-inline">
                        <li><a href="<%= request.getContextPath()%>/admin/productManager">상품관리</a></li>
                        <li><a href="<%= request.getContextPath()%>/admin/orderManager">주문관리</a></li>
                        <li><a href="<%= request.getContextPath()%>/admin/memberManager">회원관리</a></li>
                    </ul>
                </nav>