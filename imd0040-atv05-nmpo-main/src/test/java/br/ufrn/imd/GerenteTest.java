package br.ufrn.imd;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void existsGerente() throws ClassNotFoundException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Gerente");
        assertNotNull(clazzFuncionario);
    }

    @Test
    void existsAttrInGerente() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Gerente");
        Field fieldChMensal = clazzFuncionario.getDeclaredField("nivel");
        assertNotNull(fieldChMensal);
        assertEquals("br.ufrn.imd.Gerente$Nivel", fieldChMensal.getGenericType().getTypeName());
    }

    @Test
    void existsEnumInGerente() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzEnumNivel = Class.forName("br.ufrn.imd.Gerente$Nivel");
        assertNotNull(clazzEnumNivel);
    }

    @Test
    void existsMethodInGerente() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Gerente");
        Method methodCalcular = clazzFuncionario.getDeclaredMethod("calcularSalario");
        assertNotNull(methodCalcular);
        assertEquals(0, methodCalcular.getParameterCount());
        assertEquals("double", methodCalcular.getGenericReturnType().getTypeName());
    }

    @Test
    void existsConstructorInGerente() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Gerente");
        Class<?> clazzEnumNivel = Class.forName("br.ufrn.imd.Gerente$Nivel");
        Constructor<?> constructor = clazzFuncionario.getDeclaredConstructor(int.class, double.class, clazzEnumNivel);
        assertNotNull(constructor);
    }

    @Test
    void assertCalculationJunior() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazzGerente = Class.forName("br.ufrn.imd.Gerente");
        Class<Enum> clazzNivel = (Class<Enum>) Class.forName("br.ufrn.imd.Gerente$Nivel");
        Constructor<?> constructor = clazzGerente.getDeclaredConstructor(int.class, double.class, clazzNivel);

        Enum junior = Enum.valueOf(clazzNivel, "JUNIOR");

        Object instance = constructor.newInstance(10, 255, junior);

        Method methodCalcular = clazzGerente.getDeclaredMethod("calcularSalario");
        double response = (double) methodCalcular.invoke(instance);
        assertEquals(2550.0 + 1000, response);

    }

    @Test
    void assertCalculationPleno() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazzGerente = Class.forName("br.ufrn.imd.Gerente");
        Class<Enum> clazzNivel = (Class<Enum>) Class.forName("br.ufrn.imd.Gerente$Nivel");
        Constructor<?> constructor = clazzGerente.getDeclaredConstructor(int.class, double.class, clazzNivel);

        Enum junior = Enum.valueOf(clazzNivel, "PLENO");

        Object instance = constructor.newInstance(10, 255, junior);

        Method methodCalcular = clazzGerente.getDeclaredMethod("calcularSalario");
        double response = (double) methodCalcular.invoke(instance);
        assertEquals(2550.0 + 2000, response);

    }

    @Test
    void assertCalculationSenior() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazzGerente = Class.forName("br.ufrn.imd.Gerente");
        Class<Enum> clazzNivel = (Class<Enum>) Class.forName("br.ufrn.imd.Gerente$Nivel");
        Constructor<?> constructor = clazzGerente.getDeclaredConstructor(int.class, double.class, clazzNivel);

        Enum junior = Enum.valueOf(clazzNivel, "SENIOR");

        Object instance = constructor.newInstance(10, 255, junior);

        Method methodCalcular = clazzGerente.getDeclaredMethod("calcularSalario");
        double response = (double) methodCalcular.invoke(instance);
        assertEquals(2550.0 + 3000, response);

    }

}