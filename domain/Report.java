package domain;

public class Report {    
    private String reason;
    private User reportingUser;
    private User reportedUser;

    Report(User reportingUser, User reportedUser, String reason) {
        this.reportingUser = reportingUser;
        this.reportedUser = reportedUser;
        this.reason = reason;
    }

    // Getters e Setters
    public User getReportingUser() {
        return reportingUser;
    }

    public void setReportingUser(User reportingUser) {
    	if (reportingUser==null) {
    		try {
    		throw new RuntimeException("Erro User: reportingUser não pode ser null");
    		}
    		catch (RuntimeException ex){
    			System.out.println("ReportingUser não pode ser null!");
    		}
    	} else {    
        this.reportingUser = reportingUser;
    	}
    }

    public User getReportedUser() {
        return reportedUser;
    }

    public void setReportedUser(User reportedUser) {
    	if (reportedUser==null) {
    		try {
    		throw new RuntimeException("Erro User: reportedUser não pode ser null");
    		}
    		catch(RuntimeException ex) {
    			System.out.println("Erro User: reportedUser não pode ser null!");    			
    		}
    	} else {   
        this.reportedUser = reportedUser;
    	}
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
    	if (reason==null) {
    		try {
    		throw new RuntimeException("Erro String: reason não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("A razão não pode ser null!");
    		}
    	} else if(reason.equals("")) {
    		try {
    		throw new RuntimeException("Erro String: reason não pode ser vazio");
    		}
    		catch(RuntimeException ex) {
    			System.out.println("A justificativa não pode ser vazia!");
    		}
    	} else if(reason.length() < 10) {
    		try {
        		throw new RuntimeException("Erro String: reason não pode ser menor que 10 dígitos");
        		}
        	catch(RuntimeException ex) {
        		System.out.println("A justificativa não pode ser menor que 10 dígitos!");
        		}    	
    	} else {    
        this.reason = reason;
    	}
    }
   
    @Override
    public String toString() {
      return "Report: " + reportingUser + " contra " + reportedUser + ": " + reason;
    }
    
    @Override
    public boolean equals(Object obj) {
  	  if (this == obj) {
  		  return true;
  	  }
  	  if (obj == null) {
  		  return false;
  	  }
      if (getClass() != obj.getClass()) {
  		  return false;
      }
  	  Report other = (Report) obj;
  	  if (reportingUser != other.reportingUser) {
  		  return false;  	
  	  }
  	  if (reportedUser != other.reportedUser) {
  		  return false;  	
  	  }
  	  if (reason != other.reason) {
		  return false;  	
	  } else {
  	  return true;
  	  }
    }//equals()       
    
}  // Fim de Class Report
