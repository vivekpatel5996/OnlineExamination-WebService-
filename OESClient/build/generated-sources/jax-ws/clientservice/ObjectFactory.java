
package clientservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfcategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "ArrayOfcategory");
    private final static QName _ArrayOftest_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "ArrayOftest");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Category_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "category");
    private final static QName _ArrayOfquestion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "ArrayOfquestion");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Test_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "test");
    private final static QName _Question_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "question");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Mocktest_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "mocktest");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ArrayOfmocktest_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "ArrayOfmocktest");
    private final static QName _GettestResponseGettestResult_QNAME = new QName("http://tempuri.org/", "gettestResult");
    private final static QName _QuestionRightanswer_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "rightanswer");
    private final static QName _QuestionQuestiontext_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "questiontext");
    private final static QName _QuestionOption3_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "option3");
    private final static QName _QuestionOption4_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "option4");
    private final static QName _QuestionOption1_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "option1");
    private final static QName _QuestionOption2_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "option2");
    private final static QName _GetQuestionsResponseGetQuestionsResult_QNAME = new QName("http://tempuri.org/", "getQuestionsResult");
    private final static QName _GetMocktestResponseGetMocktestResult_QNAME = new QName("http://tempuri.org/", "getMocktestResult");
    private final static QName _GetCategoryResponseGetCategoryResult_QNAME = new QName("http://tempuri.org/", "getCategoryResult");
    private final static QName _MocktestCatid_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "catid");
    private final static QName _ValidatePassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _ValidateUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _TestR_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "r");
    private final static QName _TestN_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "n");
    private final static QName _CategoryCatName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "cat_name");
    private final static QName _CategoryCatInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", "cat_info");
    private final static QName _SignUpUname_QNAME = new QName("http://tempuri.org/", "uname");
    private final static QName _SignUpMailid_QNAME = new QName("http://tempuri.org/", "mailid");
    private final static QName _SignUpContactno_QNAME = new QName("http://tempuri.org/", "contactno");
    private final static QName _SignUpPwd_QNAME = new QName("http://tempuri.org/", "pwd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateResponse }
     * 
     */
    public ValidateResponse createValidateResponse() {
        return new ValidateResponse();
    }

    /**
     * Create an instance of {@link SignUpResponse }
     * 
     */
    public SignUpResponse createSignUpResponse() {
        return new SignUpResponse();
    }

    /**
     * Create an instance of {@link SignUp }
     * 
     */
    public SignUp createSignUp() {
        return new SignUp();
    }

    /**
     * Create an instance of {@link GetCategoryResponse }
     * 
     */
    public GetCategoryResponse createGetCategoryResponse() {
        return new GetCategoryResponse();
    }

    /**
     * Create an instance of {@link ArrayOfcategory }
     * 
     */
    public ArrayOfcategory createArrayOfcategory() {
        return new ArrayOfcategory();
    }

    /**
     * Create an instance of {@link Validate }
     * 
     */
    public Validate createValidate() {
        return new Validate();
    }

    /**
     * Create an instance of {@link GetMocktest }
     * 
     */
    public GetMocktest createGetMocktest() {
        return new GetMocktest();
    }

    /**
     * Create an instance of {@link GetQuestions }
     * 
     */
    public GetQuestions createGetQuestions() {
        return new GetQuestions();
    }

    /**
     * Create an instance of {@link GetQuestionsResponse }
     * 
     */
    public GetQuestionsResponse createGetQuestionsResponse() {
        return new GetQuestionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfquestion }
     * 
     */
    public ArrayOfquestion createArrayOfquestion() {
        return new ArrayOfquestion();
    }

    /**
     * Create an instance of {@link GetCategory }
     * 
     */
    public GetCategory createGetCategory() {
        return new GetCategory();
    }

    /**
     * Create an instance of {@link GetMocktestResponse }
     * 
     */
    public GetMocktestResponse createGetMocktestResponse() {
        return new GetMocktestResponse();
    }

    /**
     * Create an instance of {@link ArrayOfmocktest }
     * 
     */
    public ArrayOfmocktest createArrayOfmocktest() {
        return new ArrayOfmocktest();
    }

    /**
     * Create an instance of {@link GettestResponse }
     * 
     */
    public GettestResponse createGettestResponse() {
        return new GettestResponse();
    }

    /**
     * Create an instance of {@link ArrayOftest }
     * 
     */
    public ArrayOftest createArrayOftest() {
        return new ArrayOftest();
    }

    /**
     * Create an instance of {@link Gettest }
     * 
     */
    public Gettest createGettest() {
        return new Gettest();
    }

    /**
     * Create an instance of {@link Mocktest }
     * 
     */
    public Mocktest createMocktest() {
        return new Mocktest();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link Question }
     * 
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfcategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "ArrayOfcategory")
    public JAXBElement<ArrayOfcategory> createArrayOfcategory(ArrayOfcategory value) {
        return new JAXBElement<ArrayOfcategory>(_ArrayOfcategory_QNAME, ArrayOfcategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOftest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "ArrayOftest")
    public JAXBElement<ArrayOftest> createArrayOftest(ArrayOftest value) {
        return new JAXBElement<ArrayOftest>(_ArrayOftest_QNAME, ArrayOftest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfquestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "ArrayOfquestion")
    public JAXBElement<ArrayOfquestion> createArrayOfquestion(ArrayOfquestion value) {
        return new JAXBElement<ArrayOfquestion>(_ArrayOfquestion_QNAME, ArrayOfquestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Question }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "question")
    public JAXBElement<Question> createQuestion(Question value) {
        return new JAXBElement<Question>(_Question_QNAME, Question.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mocktest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "mocktest")
    public JAXBElement<Mocktest> createMocktest(Mocktest value) {
        return new JAXBElement<Mocktest>(_Mocktest_QNAME, Mocktest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfmocktest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "ArrayOfmocktest")
    public JAXBElement<ArrayOfmocktest> createArrayOfmocktest(ArrayOfmocktest value) {
        return new JAXBElement<ArrayOfmocktest>(_ArrayOfmocktest_QNAME, ArrayOfmocktest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOftest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gettestResult", scope = GettestResponse.class)
    public JAXBElement<ArrayOftest> createGettestResponseGettestResult(ArrayOftest value) {
        return new JAXBElement<ArrayOftest>(_GettestResponseGettestResult_QNAME, ArrayOftest.class, GettestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "rightanswer", scope = Question.class)
    public JAXBElement<String> createQuestionRightanswer(String value) {
        return new JAXBElement<String>(_QuestionRightanswer_QNAME, String.class, Question.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "questiontext", scope = Question.class)
    public JAXBElement<String> createQuestionQuestiontext(String value) {
        return new JAXBElement<String>(_QuestionQuestiontext_QNAME, String.class, Question.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "option3", scope = Question.class)
    public JAXBElement<String> createQuestionOption3(String value) {
        return new JAXBElement<String>(_QuestionOption3_QNAME, String.class, Question.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "option4", scope = Question.class)
    public JAXBElement<String> createQuestionOption4(String value) {
        return new JAXBElement<String>(_QuestionOption4_QNAME, String.class, Question.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "option1", scope = Question.class)
    public JAXBElement<String> createQuestionOption1(String value) {
        return new JAXBElement<String>(_QuestionOption1_QNAME, String.class, Question.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "option2", scope = Question.class)
    public JAXBElement<String> createQuestionOption2(String value) {
        return new JAXBElement<String>(_QuestionOption2_QNAME, String.class, Question.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfquestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getQuestionsResult", scope = GetQuestionsResponse.class)
    public JAXBElement<ArrayOfquestion> createGetQuestionsResponseGetQuestionsResult(ArrayOfquestion value) {
        return new JAXBElement<ArrayOfquestion>(_GetQuestionsResponseGetQuestionsResult_QNAME, ArrayOfquestion.class, GetQuestionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfmocktest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getMocktestResult", scope = GetMocktestResponse.class)
    public JAXBElement<ArrayOfmocktest> createGetMocktestResponseGetMocktestResult(ArrayOfmocktest value) {
        return new JAXBElement<ArrayOfmocktest>(_GetMocktestResponseGetMocktestResult_QNAME, ArrayOfmocktest.class, GetMocktestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfcategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getCategoryResult", scope = GetCategoryResponse.class)
    public JAXBElement<ArrayOfcategory> createGetCategoryResponseGetCategoryResult(ArrayOfcategory value) {
        return new JAXBElement<ArrayOfcategory>(_GetCategoryResponseGetCategoryResult_QNAME, ArrayOfcategory.class, GetCategoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "catid", scope = Mocktest.class)
    public JAXBElement<Integer> createMocktestCatid(Integer value) {
        return new JAXBElement<Integer>(_MocktestCatid_QNAME, Integer.class, Mocktest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Validate.class)
    public JAXBElement<String> createValidatePassword(String value) {
        return new JAXBElement<String>(_ValidatePassword_QNAME, String.class, Validate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Validate.class)
    public JAXBElement<String> createValidateUsername(String value) {
        return new JAXBElement<String>(_ValidateUsername_QNAME, String.class, Validate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "r", scope = Test.class)
    public JAXBElement<String> createTestR(String value) {
        return new JAXBElement<String>(_TestR_QNAME, String.class, Test.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "n", scope = Test.class)
    public JAXBElement<String> createTestN(String value) {
        return new JAXBElement<String>(_TestN_QNAME, String.class, Test.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "cat_name", scope = Category.class)
    public JAXBElement<String> createCategoryCatName(String value) {
        return new JAXBElement<String>(_CategoryCatName_QNAME, String.class, Category.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFServiceWebRole1", name = "cat_info", scope = Category.class)
    public JAXBElement<String> createCategoryCatInfo(String value) {
        return new JAXBElement<String>(_CategoryCatInfo_QNAME, String.class, Category.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "uname", scope = SignUp.class)
    public JAXBElement<String> createSignUpUname(String value) {
        return new JAXBElement<String>(_SignUpUname_QNAME, String.class, SignUp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "mailid", scope = SignUp.class)
    public JAXBElement<String> createSignUpMailid(String value) {
        return new JAXBElement<String>(_SignUpMailid_QNAME, String.class, SignUp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "contactno", scope = SignUp.class)
    public JAXBElement<String> createSignUpContactno(String value) {
        return new JAXBElement<String>(_SignUpContactno_QNAME, String.class, SignUp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pwd", scope = SignUp.class)
    public JAXBElement<String> createSignUpPwd(String value) {
        return new JAXBElement<String>(_SignUpPwd_QNAME, String.class, SignUp.class, value);
    }

}
