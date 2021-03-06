package grader.project;

import java.io.IOException;
import java.util.Date;

import com.github.antlrjavaparser.api.CompilationUnit;
import util.javac.SourceClass;

import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.JavaSource;

import bus.uigen.reflect.ClassProxy;
// gets source and object file for a class
public interface ClassDescription {
	public ClassProxy getClassProxy() ;
	public void setClassProxy(ClassProxy classProxy) ;
	public StringBuffer getText() ;
	public void setText(StringBuffer text) ;	
	public long getSourceTime() ;
	public void setSourceTime(long newVal);
	public String getClassName();
	String[] getTags();
	String getStructurePatternName();
	String[] getPropertyNames();
	String[] getEditablePropertyNames();
	JavaClass getQdoxClass();
	JavaSource getQdoxSource();
	SourceClass getJavacSourceClass();
    Class<?> getJavaClass();

    CompilationUnit getCompilationUnit() throws IOException;

}