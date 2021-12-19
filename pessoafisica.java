package p.i;

public class pessoafisica  {
        private Float cpf;
        private int cep;
        private int idade;
        private String nacionalidade;
		
		
        
        public Float getCpf() {
			return (Float) cpf;
		}
		public void setCpf(Float cpf) {
			if(cpf<=12) {
			this.cpf = cpf;
			}
		}
		public int getCep() {
			return cep;
		}
		public void setCep(int cep) {
			this.cep = cep;
		}
		public int getIdade() {
			
			return idade;
		
		}
		public void setIdade(int idade) {
			if(idade>=18) {
			this.idade = idade;
			}
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			
			String brasileiro = null;
			
				this.nacionalidade = nacionalidade;
			
		}
			
		}
        


		