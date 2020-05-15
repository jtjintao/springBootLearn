package com.controler;

import org.apache.jasper.servlet.JspServlet;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "*.jsp",name="MyJspServlet")
public class MyJspServlet extends JspServlet {

}
