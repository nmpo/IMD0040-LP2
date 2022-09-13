package br.ufrn.imd;

import org.junit.jupiter.api.Test;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void existsFuncionario() throws ClassNotFoundException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Funcionario");
        assertNotNull(clazzFuncionario);
    }

    @Test
    void existsAttrInFuncionario() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Funcionario");
        Field fieldChMensal = clazzFuncionario.getDeclaredField("chMensal");
        Field fieldHH = clazzFuncionario.getDeclaredField("hh");

        assertNotNull(fieldChMensal);
        assertEquals("int", fieldChMensal.getGenericType().getTypeName());

        assertNotNull(fieldHH);
        assertEquals("double", fieldHH.getGenericType().getTypeName());
    }

    @Test
    void existsMethodInFuncionario() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Funcionario");
        Method methodCalcular = clazzFuncionario.getDeclaredMethod("calcularSalario");
        assertNotNull(methodCalcular);
        assertEquals(0, methodCalcular.getParameterCount());
        assertEquals("double", methodCalcular.getGenericReturnType().getTypeName());
    }

    @Test
    void existsConstructorInFuncionario() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Funcionario");
        Constructor<?> constructor = clazzFuncionario.getDeclaredConstructor(int.class, double.class);
        assertNotNull(constructor);
    }

    @Test
    void assertCalculation() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Funcionario");
        Constructor<?> constructor = clazzFuncionario.getDeclaredConstructor(int.class, double.class);
        Object instance = constructor.newInstance(10, 254);

        Method methodCalcular = clazzFuncionario.getDeclaredMethod("calcularSalario");
        double response = (double) methodCalcular.invoke(instance);
        assertEquals(2540.0, response);
    }

}