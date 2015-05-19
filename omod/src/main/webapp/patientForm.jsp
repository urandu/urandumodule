<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

<p>New Patient</p>
<form class="form" action="<c:url value='/create' />" method="post">
    <label for="fname">First Name:</label>
    <input type="text" name="fname" id="fname" required>

    <label for="lname">Last Name:</label>
    <input type="text" name="lname" id="lname" required>

    <label for="bdate">Date of birth:</label>
    <input type="date" name="bdate" id="bdate" required>
    <button>Submit</button>

</form>

<%@ include file="/WEB-INF/template/footer.jsp"%>