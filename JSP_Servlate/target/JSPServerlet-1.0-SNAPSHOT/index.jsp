<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Calculator</title>
</head>
<body>
<h1><%= "Calculator" %>
</h1>
<br/>
<form method="GET" action="Calculate">

    <input type="text" name="number1" placeholder="Enter the First Number"/>
    <br/><br/><br/>


    <select name ="sign">
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>

    </select>

    <br/><br/><br/>
    <input type="text" name="number2" placeholder="Enter the Second Number"/>
    <br/><br/><br/>

    <input type="submit" value="calculate"/>


</form>


</body>
</html>