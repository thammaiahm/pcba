package com.mot.upd.pcba.constants;

public class ServiceMessageCodes {
	
public ServiceMessageCodes(){
		
	}
	
	//Codes for dispatch serial no
		public static final int SUCCESS=0000;
		public static final int NO_NEW_SERIAL_NO_AVAILABLE=5001;
		public static final int INVALID_REQUEST_TYPE=5002;
		public static final int INVALID_BUILD_TYPE=5003;
		public static final int SERIAL_NO_NOT_VALID=5004;
		public static final int INPUT_PARAM_MISSING=5005;
		public static final int NO_ULMA_AVAILABLE=5006;
		public static final int NEW_SERIAL_NO_AVAILABLE=5007;
		public static final int NEW_ULMA_AVAILABLE=5008;
		
		
	//Messages for dispatch serial no WS
       public static final String OPERATION_SUCCESS="Operation Success";
       public static final String NO_SERIAL_NO_AVAILABLE_FOR_DISPATCH_MSG="No New Serial number available for Dispatch";
       public static final String INVALID_REQUEST_TYPE_MSG="Request type Value must be V or D";
       public static final String INVALID_BUILD_TYPE_MSG="Build type Value must be PROD";
       public static final String SERIAL_NO_NOT_VALID_MSG="Serial number not valid";
       public static final String SN_MISSING_ERROR="Following Fields are mandatory- Serial Number,Build type,Request-type,RSD id,MASC ID.Please re-enter and try again.";
       public static final String NO_ULMA_AVAILABLE_MSG="No ULMA Available For Dispatch";
       public static final String NEW_ULMA_AVAILABLE_MSG="New ULMA Available For Dispatch";
       public static final String SERIAL_NO_AVAILABLE_FOR_DISPATCH_MSG="New Serial number available for Dispatch";
            

}
