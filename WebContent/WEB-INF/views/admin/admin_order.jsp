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
                            <h1><a href="admin_header.html">re:flex</a></h1>
                    </div>
                    <div id="search" class="col-md-4">
                        <h2 class="sr-only">ìí ê²ì</h2>
                        <form action="">
                            <button type="submit" id="btn-search" aria-label="search products">
                                <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
                            </button>
                            <input type="search" name="search" placeholder="ê²ì">
                        </form>
                    </div>
                    <div id="header-first-menu" class="col-md-4">
                        <ul class="list-unstyled list-inline text-right">
                            <li><a href="#">ê´ë¦¬ì¸</a></li>
                            <li>
                                <h2 class="sr-only">ì¥ë°êµ¬ë</h2>
                                <a href="#" aria-label="cart"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
                            </li>
                        </ul>
                        <!-- side menu -->
                        <div>
                            <h2 class="sr-only">ì¬ì´ëë©ë´</h2>
                            <button type="button"  id="btn-sidemenu">
                                <span class="glyphicon glyphicon-list" aria-hidden="true"></span>
                            </button>
                            <ul id="level1-sidemenu" class="list-unstyled sidemenu">
                                <li></li>
                                <li id="recommended" data-target="#level2-recommended"><a href="#">ì´ë´ ë ë¹ë ¤ë´<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">í¨ì<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">ë·°í°<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">ë¦¬ë¹<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">í¤ì¦<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">ë ì <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                                <li><a href="#">ê³ ê°ìë¹ì¤</a></li>
                            </ul>
                            <ul id="level2-recommended" class="list-unstyled sidemenu">
                                <li class="go-back text-center"><a href="#"><span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>ì´ë´ ë ë¹ë ¤ë´</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                                <li><a href="#">ë°ìºì¤ ê° ë</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
        
                <!-- second line -->
                <nav id="header-second" class="line-style">
                    <h2 class="sr-only">ë©ì¸ë©ë´</h2>
                    <ul class="list-unstyled list-inline">
                        <li><a href="admin_item.html">ìíê´ë¦¬</a></li>
                        <li><a href="admin_order.html">ì£¼ë¬¸ê´ë¦¬</a></li>
                        <li><a href="admin_member.html">íìê´ë¦¬</a></li>
                    </ul>
                </nav>
        
                <!-- third line -->
                <nav id="header-second" class="line-style-notop">
                      <!-- <h2 class="sr-only">ë©ì¸ë©ë´</h2> -->

                      <ul class="list-unstyled list-inline">
                          <li><a href="admin_order.html">ë°°ì¡ê´ë¦¬</a></li>
                          <li><a href="admin_order_list.html">ë íë´ì­</a></li>
                          <li><a href="admin_order_sale.html">íë§¤íí©</a></li>
                      </ul>

                  </nav>
        
                  <div>ë°°ì¡ê´ë¦¬</div>

            </header>

    


</body>
</html>