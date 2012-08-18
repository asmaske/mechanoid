package com.robotoworks.mechanoid.ops.generator


import static extension com.robotoworks.mechanoid.common.util.Strings.*
import static extension com.robotoworks.mechanoid.ops.generator.Extensions.*
import com.robotoworks.mechanoid.ops.opServiceModel.Model

class OperationProcessorGenerator {
		def CharSequence generate(Model model) '''
			�var svc = model.service�
			/*
			 * Generated by Robotoworks Mechanoid
			 */
			package �model.packageName�;
			
			import android.content.Intent;
			
			import com.robotoworks.mechanoid.ops.Operation;
			import com.robotoworks.mechanoid.ops.OperationInstantiationException;
			import com.robotoworks.mechanoid.ops.OperationService;
			import com.robotoworks.mechanoid.ops.OperationProcessor;			
			
			public abstract class Abstract�svc.name.pascalize�Processor extends OperationProcessor {

				private static �svc.name.pascalize�OperationRegistry sOperationRegistry;
				
				@Override
				protected Operation createOperation(String action) {
					if(sOperationRegistry == null) {
						sOperationRegistry = new �svc.name.pascalize�OperationRegistry();
					}
					
					Class<? extends Operation> operation = sOperationRegistry.getOperation(action);
				
					try {
						Operation instance = operation.newInstance();
						
						return instance;
					}
					catch(Exception x) {
						throw new OperationInstantiationException(x);
					}
				}
				public Abstract�svc.name.pascalize�Processor(OperationService service) {
					super(service);
				}
			}
			'''
			
		def CharSequence generateStub(Model model) '''
			�var svc = model.service�
			/*
			 * Generated by Robotoworks Mechanoid
			 */
			package �model.packageName�;
			
			import com.robotoworks.mechanoid.ops.OperationService;
			
			public class �svc.name.pascalize�Processor extends Abstract�svc.name.pascalize�Processor {
				public �svc.name.pascalize�Processor(OperationService service) {
					super(service);
				}
			}
		'''
}