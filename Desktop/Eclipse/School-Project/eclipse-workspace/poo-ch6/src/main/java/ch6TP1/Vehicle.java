package ch6TP1;

public class Vehicle {

		private String brand;
		private String model;
		private Integer year;
		private Boolean electric; 
		private Moteur moteur;

		public Vehicle(String brand, String model, Integer year, Boolean electric, Moteur moteur) {
			if (brand == null || brand.isBlank()|| model == null || model.isBlank() || year < 1990  || year > 2050){
				throw new IllegalArgumentException("pas bon");}
			this.brand = brand;
			this.model = model;
			this.year = year;
			this.electric = electric;
			this.moteur = moteur;

		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public Boolean isElectric() {
			return electric;
		}

		public void setElectric(Boolean electric) {
			this.electric = electric;
		}
		
		public Moteur getMoteur() {
			return moteur;
		}

		public void setMoteur(Moteur moteur) {
			this.moteur = moteur;
		}

	}
