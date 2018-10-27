<div class="container">

	<div class="row">
		<!--  side bar -->
		<div class="col-lg-3">
			<%@include file="./shares/sidebar.jsp"%>
		</div>

		<!-- breadcrumb trail -->
		<div class="col-lg-9">
			<nav aria-label="breadcrumb">
				<c:choose>
					<c:when test="${userClickIndicator == 'showCategoryProducts' }">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot }/home"></a>Home</li>
							<li class="breadcrumb-item">Category</li>
							<li class="breadcrumb-item active">${title }</li>
						</ol>
					</c:when>
					<c:otherwise>
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot }/home"></a>Home</li>
							<li class="breadcrumb-item active">All products</li>
						</ol>
					</c:otherwise>
				</c:choose>
			</nav>
		</div>
	</div>
</div>


