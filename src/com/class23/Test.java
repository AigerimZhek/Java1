package com.class23;

public class Test {
	public static void main(String[] args) {
		
        System.out.println("---Creating Employee object---");
        Employee emp=new Employee();
        System.out.println(Employee.department);
        Employee.work();
        emp.salary=90000;
        emp.getPaid();
        
        
        System.out.println("---Creating ScrumTeam object---");
        ScrumTeam st=new ScrumTeam();
        ScrumTeam.work();
        st.salary=100000;
        st.getPaid();
        st.artifacts="Product Backlog, Sprint Backlog, Burndown Chart";
        st.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro" ;
        st.attendScrumMeetings();
        st.workOnArtifacts();
       
        
        System.out.println("---Creating Developer object---");
        Developer dev = new Developer();
        Developer.work();
        dev.salary=120000;
        dev.getPaid();
        dev.artifacts="Sprint Backlog";
        dev.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
        dev.workOnArtifacts();
        dev.attendScrumMeetings();
        dev.code();
        
        FrontEndDeveloper fed = new FrontEndDeveloper();
        fed.doHtml();
        BackEndDeveloper bed = new BackEndDeveloper();
        bed.doSql();
        
        
        System.out.println("---Creating Tester object---");
        Tester qa = new Tester();
        qa.salary=100000;
        qa.getPaid();
        qa.artifacts="Sprint Backlog";
        qa.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
        qa.workOnArtifacts();
        qa.attendScrumMeetings();
        qa.test();
        
        ManualTester mt = new ManualTester();
        mt.testManually();
        AutomationTester at = new AutomationTester();
        at.codeInJava();
        
        
        System.out.println("---Creating Business Analyst object---");
        BusinessAnalyst ba = new BusinessAnalyst();
        ba.salary=85000;
        ba.getPaid();
        ba.artifacts="Sprint Backlog, Product Backlog";
        ba.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
        ba.workOnArtifacts();
        ba.attendScrumMeetings();
        ba.writeUserStories();
        
        
        System.out.println("---Creating Scrum Master object---");
        ScrumMaster sm = new ScrumMaster();
        sm.salary=90000;
        sm.getPaid();
        sm.artifacts="Burndown Chart";
        sm.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
        sm.workOnArtifacts();
        sm.attendScrumMeetings();
        sm.driveScrumMeetings();
        
        
        System.out.println("---Creating Product Owner object---");
        ProductOwner po = new ProductOwner();
        po.salary=150000;
        po.getPaid();
        po.artifacts="Sprint Backlog, Product Backlog";
        po.ceremonies="Sprint grooming, Sprint Planning, Sprint Demo";
        po.workOnArtifacts();
        po.attendScrumMeetings();
        po.prioritizeBacklog();
        po.talkToClient();
    }

}
