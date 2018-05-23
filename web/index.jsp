<%--
  Created by IntelliJ IDEA.
  User: Himedere
  Date: 5/23/2018
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Future Value Calculator</title>
  </head>
  <body>
  <form method="post" action="/cal">
    <fieldset>
      <legend>Calculator</legend>
      <table>
        <tr>
          <td>Investment Amount</td>
          <td><input type="text" name="investmentAmount" value=${investmentAmount}></td>
        </tr>
        <tr>
          <td>Yearly Interest Rate</td>
          <td><input type="text" name="yearlyRate" value=${yearlyRate}></td>
        </tr>
        <tr>
          <td>Amount of Years</td>
          <td><input type="text" name="year" value=${year}></td>
        </tr>
        <tr>
          <td colspan="2">
            <input type="submit" value="Calculate"/>
          </td>
        </tr>
        <tr>
          <td>Result:</td>
          <td><input name="result" type="text" value="${result}"> </td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
