# springMvcRequestNotFindCapture
Custom capture Exception in springMvc


Must Comment <mvc:default-servlet-handler/>  in spring.xml file 

Rewrite noHandlerFound method in DispatcherServlet redirect not find request to /demo/notFound path  and definition that on 
sx.java.www.controller.DemoController.notFind method
