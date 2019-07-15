<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container">
	<H1>Welcome ${name}</H1>


	<table class="table table-striped">
		<caption>Your Teachers are</caption>
		<thead>
			<th>First Name</th>
			<th>Last Name</th>
		</thead>
		<tbody>
			<c:forEach items="${teachers}" var="teacher">
				<tr>
					<td>${teacher.firstName}</td>
					<td>${teacher.lastName}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<p>
		<font color="red">${errorMessage}</font>
	</p>
</div>
