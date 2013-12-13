<%@ include file="taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>new address</title>
</head>
<body>
<h1>Neue Adresse:</h1>
<form id="formId" action="${ctx}/new" method="post">
    <table>
        <tr>
            <td><label for="name">Name</label></td>
            <td><input id="name" type="text" size="50" maxlength="255" name="name"></td>
        </tr>
        <tr>
            <td><label for="street">Strasse</label></td>
            <td><input type="text" size="50" maxlength="255" name="street" id="street"></td>
        </tr>
        <tr>
            <td><label for="houseNumber">Hausnummer</label></td>
            <td><input type="text" size="50" maxlength="255" name="houseNumber" id="houseNumber"></td>
        </tr>
        <tr>
            <td><label for="zip">PLZ</label></td>
            <td><input type="text" size="50" maxlength="255" name="zip" id="zip"/></td>
        </tr>
        <tr>
            <td><label for="city">Stadt</label></td>
            <td><input type="text" size="50" maxlength="255" name="city" id="city"/></td>
        </tr>
    </table>
    <input id="createNewAddress" type="submit" value="Speichern" />
</form>
</body>
</html>