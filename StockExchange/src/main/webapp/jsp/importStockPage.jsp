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

    <img src="images/logo.png" alt="no image" width="70px" height="80px;">
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
    <a href="#">Update IPO Details</a>
    <a href="signup.html" id="topic">Logout</a>

  </nav>

  <p id="body-heading">Import Excel</p>
  <form>
    <p id="search">Select file to be uploaded : <input type="file" name="file" /><button type="button" id="upload"
        class="btn btn-success">Upload</button></p>
    <br><br>
    <p id="search"><a href="stock-details.html">Click here to download sample excel file</a></p>
  </form>
  <footer>
    <p id="ftext">Copyright&copy; 2019</p>
  </footer>
</body>
</html>