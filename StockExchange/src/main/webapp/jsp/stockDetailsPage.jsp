<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <header>

        <img src="images/logo.png" alt="no image" width="70px" height="70px;">
        <p id="heading">Stock Market</p>
    </header>
    <nav>
        <a href="importStockPage.html">Import Data</a>

        <div class="dropdown">
            <button class="dropbtn">Manage Company
                <i class="fa fa-caret-down"></i>
            </button>
            <div class="dropdown-content">
                <a href="insertCompanyPage.html">Add Company</a>
                <a href="#">Update Company</a>
            </div>
        </div>
        <a href="listCompanyPage.html">Manage exchange</a>
        <a href="">Update IPO Details</a>
        <a href="signup.html" id="topic">Logout</a>
    </nav>
    <p id="body-heading">Summary of upload</p>
    <form>
        <table class="insert-table">
            <tr>
                <td>Company Name</td>
                <td>Abc LTD</td>
            </tr>
            <tr>
                <td>Stock Exchange</td>
                <td>Bombay Stock Exchange</td>
            </tr>
            <tr>
                <td>No. of Records Imported</td>
                <td>80</td>
            </tr>
            <tr>
                <td>
                    From date
                </td>
                <td></td>

                <td>To Date</td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="submit" value="Ok" id="ok-button" /></td>
            </tr>
        </table>
    </form>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>
</html>