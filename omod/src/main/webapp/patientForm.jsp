<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

<p>New Patient</p>
<form class="form" action="<c:url value='/module/urandumodule/submitForm.form' />" method="post">
    <label for="fname">First Name:</label>
    <input type="text" name="fname" id="fname" required>

    <label for="given_name">Given Name:</label>
    <input type="text" name="given_name" id="given_name" required>

    <label for="dob">Date of birth:</label>
    <input type="date" name="dob" id="dob" required>
    <button>Submit</button>

</form>

<%@ include file="/WEB-INF/template/footer.jsp"%>