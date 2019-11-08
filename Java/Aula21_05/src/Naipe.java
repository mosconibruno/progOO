
public enum Naipe {
	PAUS {
		@Override
		public void msgNaipe() {
			System.out.println("ZAPADA!");			
		}
	}, COPAS {
		@Override
		public void msgNaipe() {
			System.out.println("COPADA!");
		}
	}, ESPADAS {
		@Override
		public void msgNaipe() {
			System.out.println("Meio Fraco!");
		}
	}, OUROS {
		@Override
		public void msgNaipe() {
			System.out.println("Fraquinho!");
		}
	};
	
	abstract public void msgNaipe();
}
