<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon"
	href="${pageContext.request.contextPath}/static/image/favicon.png" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/member/signupOk.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/all.css">
<meta charset="UTF-8">
<title>이츠타임 - 회원가입 완료</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="css-1qho7a0 erwg4uz0">
		<div class="css-eqy22p e8mwi4j6">
			<p class="css-b6e74t e8mwi4j5">회원가입이 완료되었습니다.</p>
			<div class="css-1921apv e8mwi4j4">
				<div class="css-1crdca1 e8mwi4j0">
					<button class="css-7os9p2 e4nu7ef3" type="button"
						onclick="location.href='${pageContext.request.contextPath}/index.member'" height="46" radius="3">
						<span class="css-ymwvow e4nu7ef1">홈페이지로 이동</span>
					</button>
				</div>
			</div>
		</div>
		<jsp:include page="../footer.jsp" />
	</div>
</body>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
</html>