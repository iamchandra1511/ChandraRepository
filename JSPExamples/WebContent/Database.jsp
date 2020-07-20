<html>
<body>

<%@page import="java.sql.DriverManager,java.sql.Connection,java.sql.Statement,java.sql.ResultSet"%>
<%@page session="true"%>

<%!
Connection con;
Statement st;
ResultSet r;
String username,password,databasepassword;
%>

<%
    username=request.getParameter("username");
	password=request.getParameter("password");
	session.setAttribute("user", username);
	session.setAttribute("pwd", password);
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SampleApplication","root","root");
    st=con.createStatement();
    r=st.executeQuery("select password from users where username='"+username+"'");
    r.next();
    databasepassword=r.getString(1);
    out.print(databasepassword);
    
    if(password.equals(databasepassword))
    	
    	
    {
        %>
        	
          <jsp:forward page="success.jsp"/>
          <%
        }
        else
        {	
        
    %>
    <jsp:include page="username.html"/>
    <%
    }
    %>	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
 

</body>
</html>