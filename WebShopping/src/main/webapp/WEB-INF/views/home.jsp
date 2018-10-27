<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<!DOCTYPE html>
<html lang="en">

<head>
<script>
	window.menu = "${title}";
</script>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop ${title }</title>

<!-- Bootstrap core CSS -->
<link href="${css }/bootstrap-space-lab-theme.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css }/shop-homepage.css" rel="stylesheet">

<!--  my css -->
<link href="${css }/mycss.css" rel="stylesheet">
</head>

<body>
	<div class=wrapper>
		<!-- navigation bar -->
		<%@include file="./shares/navibar.jsp"%>

		<!-- main content -->
		<div class=content>
			<c:choose>
				<c:when test="${userClickIndicator == 'about' }">
					<%@include file="./shares/about.jsp"%>
				</c:when>
				<c:when test="${userClickIndicator == 'contact' }">
					<%@include file="./shares/contact.jsp"%>
				</c:when>
				<c:when test="${userClickIndicator == 'showAllProducts' }">
					<%@include file="./showProducts.jsp"%>
				</c:when>
				<c:when test="${userClickIndicator == 'showCategoryProducts' or userClickIndicator == 'showAllProducts'}">
					<%@include file="./showProducts.jsp"%>
				</c:when>

				<c:otherwise>
					<%@include file="./shares/content.jsp"%>
				</c:otherwise>
			</c:choose>
		</div>
		<!--  footer  -->
		<%@include file="./shares/footer.jsp"%>

	</div>

	<!-- Bootstrap core JavaScript -->
	<script src="${js }/jquery-3.3.1.min.js"></script>
	<script src="${js }/bootstrap.bundle.min.js"></script>

	<!-- my js -->
	<script src="${js }/myshopping.js"></script>

</body>

</html>
