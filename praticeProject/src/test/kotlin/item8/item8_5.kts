/**
 * Lateinit Property와 notNull Delegate
 */

/**
 * lateinit 과 nullable의 차이점
 *
 * 1. !!연산자로 언팩을 안해도 된다
 *
 * 2. 이후 null을 사용하고 싶을때 nullable로도 만들 수 있음
 *
 * 3. 프로퍼티 초기화 이후로 다시 비초기화 상태로 돌아갈 수 없음
 */

class UserControllerTest {
//    private var dao: UserDao? = null
//    private var controller: UserController? = null

    private lateinit var dao : UserDao
    private lateinit var controller : UserController

    @BeforeEach
    fun init() {
        dao = mockk()
//        controller = UserControler(dao!!)
        controller = UserController(dao)
    }

    @Test
    fun test() {
        controller!!.doSomething()
    }
}


/**
 * lateinit이 사용 불가능하여 Delegates.notNull을 사용해야하는 경우
 * -> Int, Long, Double, Boolean 같이 기본 타입과 연관된 값으로 초기화 해야하는 경우
 */

class DoctorActivity : Activity() {
    private var doctorId : Int by Delegates.notNull()
    private var fromNotification: Boolean by Delegates.notNull()

    override fun onCreate(savedInstanceState : Bundel?) {
        super.onCreate(savedInstanceState)
        doctorId = intent.extras.getInt(DOCTOR_ID_ARG)
        fromNotification = intent.extras.getBoolean(FROM_NOTIFICATION_ARG)
    }

    //프로터피 위임을 사용할 경우
    //private var doctorId : Int by arg(DOCTOR_ID_ARG)
    //private var fromNotification: Boolean by arg(FROM_NOTIFICATION_ARG)
}