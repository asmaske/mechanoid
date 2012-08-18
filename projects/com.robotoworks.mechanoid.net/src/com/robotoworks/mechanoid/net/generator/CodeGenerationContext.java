package com.robotoworks.mechanoid.net.generator;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtend2.lib.StringConcatenation;

public class CodeGenerationContext {
	private Set<String> imports = new HashSet<String>();
	
	public void registerImport(String importId){
		imports.add(importId);
	}
	
	@SuppressWarnings("deprecation")
	public StringConcatenation printImports(){
		StringConcatenation builder = new StringConcatenation();
		for(String str:imports){
			builder.append("import ");
			builder.append(str);
			builder.append(";");
			builder.newLine();
		}
		return builder;
	}
	
	public void clearImports(){
		imports.clear();
	}
}
