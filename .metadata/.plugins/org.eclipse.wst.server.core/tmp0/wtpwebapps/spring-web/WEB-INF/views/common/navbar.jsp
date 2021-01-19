<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark mb-3">
	<a href="/shop/index.jsp" class="navbar-brand">쇼핑몰</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsible-navbar">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="collapsible-navbar">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a href="/shop/index.jsp" class="nav-link">홈</a></li>
			<li class="nav-item dropdown">
      			<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        			카테고리
		      	</a>
		      	<div class="dropdown-menu">
		      	<c:forEach var="category" items="${categories }">
		        	<a class="dropdown-item" href="list.do?catno=${category.typeNo }">${category.name }</a>
		      	</c:forEach>
		      	</div>
		    </li>
		</ul>
		<ul class="navbar-nav ">
			<li class="nav-item"><a href="/shop/loginform.jsp" class="nav-link">로그인</a></li>
			<li class="nav-item"><a href="/shop/form.jsp" class="nav-link">회원가입</a></li>
			<li class="nav-item"><a href="/shop/cart/list.jsp" class="nav-link">장바구니</a></li>
			<li class="nav-item"><a href="/shop/order/list.jsp" class="nav-link">주문내역</a></li>
			<li class="nav-item"><a href="/shop/my/info.jsp" class="nav-link">내정보</a></li>
			<li class="nav-item"><a href="/shop/logout.jsp" class="nav-link">로그아웃</a></li>
		</ul>	
	</div>
</nav> 