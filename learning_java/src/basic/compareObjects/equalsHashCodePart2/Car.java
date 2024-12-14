package basic.compareObjects.equalsHashCodePart2;

import java.util.Objects;

public class Car {
	private String color;
	private String mod;

	private int age;

	public Car(String color, String mod, int age) {
		super();
		this.color = color;
		this.mod = mod;
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public String getMod() {
		return mod;
	}

	public int getAge() {
		return age;
	}

	/*
	 * Sobrescrevendo os metodos equals e hashCode. Aqui o metodo hashCode vai gerar
	 * um codigo has para cada propriedade dessa classe
	 */
	@Override
	public int hashCode() {
		return Objects.hash(age, color, mod);
	}

	/*
	 * Sobrescrevendo o metodo equals. Aqui o equals fara uso do codigo hash dado
	 * pelo metodo acima, o codigo diz. **se essa class e igual ao objeto recebido por
	 * parametro retorne verdadeiro, **se o objeto que foi recebino por parametro e
	 * nulo retorne falso, **se o metodo que retorna um objeto da classe em questão é
	 * diferente do objeto retornado pelo mesmo metodo do objeto recebido por
	 * parametro são diferntes então retorna false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(mod, other.mod);
	}

}
