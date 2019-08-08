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
        
        <img src="images/logo.png" alt="no image" width="70px" height="70px;"> <p id="heading">Stock Market</p>
        
         <!-- <div id="text"> -->
             
         </header>
         <nav>
                <a href="dispaly-ipodetails.html">IPO Details</a>
                <a href="comparisonPage.html">Compare Company</a>
                <a href="comparisonPage.html">Company Sectors</a>
                <a href="asignup.html" id="topic">Logout</a>
         </nav>
        
    
    
    <article>
        <form>
            <p id="body-heading">Company Details</p>
            <table class="table">
                <tr>
                    <td><label>Select Company/Sector</label></td>
                    <td><select name="company" required>
                            <option value="company">Company</option>
                            <option value="sector">Sector</option>
                            
                        </select></td>
                </tr>
                <tr>
                    <td><label>Select Stock Exchange</label></td>
                    <td><select name="stockexchange" required>
                            <option value="BSE">BSE</option>
                            <option value="NSE">NSE</option>
                        </select></td>
                </tr>
                <tr>
                    <td><label>Company Name</label></td>
                    <td><input type="text" name="companyname" id="companyname" required /></td>
                </tr>
                <tr>
                    <td><label> From date</label></td>
                    <td><input type="date" name="from" id="from" required /></td>
                    <td><label>To date</label></td>
                    <td><input type="date" name="to" id="to" required /></td>
                </tr>
                <tr>
                    <td>Specify Periodicity</td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="Generate Map" id="generate-button" /></td>
                    <td><a href="#">
                            <span class="glyphicon glyphicon-plus-sign"></span>
                          </a></td>
                </tr>

            </table>
        </form>
    </article>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>
</html>