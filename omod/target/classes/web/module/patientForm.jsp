<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">


<%@ include file="template/localHeader.jsp"%>
<c:if test="${save_success}">
    ${save_success}
</c:if>

<p>New Patient</p>
<form class="form" action="<c:url value='/module/urandumodule/submitForm.form' />" method="get">

    <label for="given_name">Given Name:</label>
    <input type="text" name="given_name" id="given_name" required>

    <label for="middle_name">Middle Name:</label>
    <input type="text" name="middle_name" id="middle_name" required>

    <label for="family_name">Family Name:</label>
    <input type="text" name="family_name" id="family_name" required>


    <label for="id_number">ID number:</label>
    <input type="text" name="id_number" id="id_number" required>

    <label for="dob">Date of birth:</label>
    <input format="yyyy-mm-dd" type="date" name="dob" id="dob" required>


    <label for="gender">Gender:</label>
    <select id="gender" name="gender" >
        <option value="M">Male</option>
        <option value="M">Female</option>
    </select>

    <label for="address">Address:</label>
    <input type="text" name="address" id="address" required>

    <label for="town">Town:</label>
    <input type="text" name="town" id="town" required>

    <label for="postal_code">Postal Code:</label>
    <input type="text" name="postal_code" id="postal_code" required>

    <label for="country">Country:</label>
    <input type="text" name="country" id="country" required>

    <button>Submit</button>

</form>

<%@ include file="/WEB-INF/template/footer.jsp"%>