package week1.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class FixedArrayTest {

    @Test
    fun `배열 생성`() {
        val array = FixedArrayImpl<Int>(5)
        array.set(0, 10)
        array.set(1, 20)
        array.set(2, 30)
        assertEquals(10, array.get(0))
        assertEquals(20, array.get(1))
        assertEquals(30, array.get(2))
        assertThrows<IndexOutOfBoundsException> { array.get(-1) }
        assertThrows<IndexOutOfBoundsException> { array.get(5) }
    }

    @Test
    fun `배열 요소 설정(set)`() {
        val array = FixedArrayImpl<Int>(5)
        array.set(0, 10)
        array.set(1, 20)
        array.set(2, 30)
        assertEquals(10, array.get(0))
        assertEquals(20, array.get(1))
        assertEquals(30, array.get(2))
        assertThrows<IndexOutOfBoundsException> { array.set(-1, 10) }
        assertThrows<IndexOutOfBoundsException> { array.set(5, 10) }
    }

    @Test
    fun `배열 요소 접근(get)`() {
        val array = FixedArrayImpl<Int>(5)
        assertEquals(5, array.size)
    }

    @Test
    fun `배열 크기 반환(size)`() {
        val array = FixedArrayImpl(5)
        array.set(0, 10)
        array.set(1, 20)
        array.set(2, 30)

        assertEquals(5, array.size)
    }

    @Test
    fun `특정 값 검색(search)`() {
        val array = FixedArrayImpl<Int>(5)
        array.set(0, 10)
        array.set(1, 20)
        array.set(2, 30)
        assertEquals(0, array.search(10))
        assertEquals(1, array.search(20))
        assertEquals(2, array.search(30))
        assertEquals(-1, array.search(40))
    }
}
