// Generated from c:\Users\guiml\Desktop\bdex-lfa-10\src\Bdex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BdexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		VARNAME=46, STRING=47, INT=48, DOUBLE=49, WS=50, COMMENT=51, ERROR=52;
	public static final int
		RULE_program = 0, RULE_operation = 1, RULE_tableOperation = 2, RULE_media = 3, 
		RULE_sum = 4, RULE_div = 5, RULE_mull = 6, RULE_add = 7, RULE_delete = 8, 
		RULE_extraction = 9, RULE_createTable = 10, RULE_setValue = 11, RULE_junction = 12, 
		RULE_read = 13, RULE_print = 14, RULE_iteration = 15, RULE_forOperation = 16, 
		RULE_forConditions = 17, RULE_expr = 18, RULE_newVarName = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "operation", "tableOperation", "media", "sum", "div", "mull", 
			"add", "delete", "extraction", "createTable", "setValue", "junction", 
			"read", "print", "iteration", "forOperation", "forConditions", "expr", 
			"newVarName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'mediaColl('", "')'", "'mediaLine('", "'sumColl('", "'sumLine('", 
			"'divColl('", "'divLine('", "'mullColl('", "'mullLine('", "'addLine'", 
			"'('", "','", "'deleteLine('", "'extract('", "'Table'", "'='", "'setValue('", 
			"'junctionTables('", "'readColl('", "'readLine('", "'readStr('", "'printColl('", 
			"'printLine('", "'print('", "'iteration('", "'for'", "'from'", "'to'", 
			"'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'<='", "'<'", "'!='", "'&&'", 
			"'number'", "'str'", "'array'", "'{'", "'}'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "VARNAME", 
			"STRING", "INT", "DOUBLE", "WS", "COMMENT", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Bdex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BdexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BdexParser.EOF, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(40);
				operation();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(BdexParser.VARNAME, 0); }
		public TableOperationContext tableOperation() {
			return getRuleContext(TableOperationContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public JunctionContext junction() {
			return getRuleContext(JunctionContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public ForOperationContext forOperation() {
			return getRuleContext(ForOperationContext.class,0);
		}
		public NewVarNameContext newVarName() {
			return getRuleContext(NewVarNameContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(VARNAME);
				setState(49);
				match(T__0);
				setState(50);
				tableOperation();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				createTable();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				junction();
				}
				break;
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				read();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				print();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				iteration();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				forOperation();
				}
				break;
			case T__39:
			case T__40:
			case T__41:
			case T__44:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				newVarName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOperationContext extends ParserRuleContext {
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public MullContext mull() {
			return getRuleContext(MullContext.class,0);
		}
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public SetValueContext setValue() {
			return getRuleContext(SetValueContext.class,0);
		}
		public ExtractionContext extraction() {
			return getRuleContext(ExtractionContext.class,0);
		}
		public TableOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOperation; }
	}

	public final TableOperationContext tableOperation() throws RecognitionException {
		TableOperationContext _localctx = new TableOperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tableOperation);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				delete();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				media();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				add();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				sum();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				div();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				mull();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				iteration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(68);
				setValue();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(69);
				extraction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MediaContext extends ParserRuleContext {
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
	 
		public MediaContext() { }
		public void copyFrom(MediaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MediaLineContext extends MediaContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MediaLineContext(MediaContext ctx) { copyFrom(ctx); }
	}
	public static class MediaCollContext extends MediaContext {
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public MediaCollContext(MediaContext ctx) { copyFrom(ctx); }
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_media);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new MediaCollContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__1);
				setState(73);
				match(STRING);
				setState(74);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new MediaLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__3);
				setState(76);
				expr(0);
				setState(77);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumContext extends ParserRuleContext {
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
	 
		public SumContext() { }
		public void copyFrom(SumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableOperationSumLineContext extends SumContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TableOperationSumLineContext(SumContext ctx) { copyFrom(ctx); }
	}
	public static class TableOperationSumCollContext extends SumContext {
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public TableOperationSumCollContext(SumContext ctx) { copyFrom(ctx); }
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sum);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new TableOperationSumCollContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__4);
				setState(82);
				match(STRING);
				setState(83);
				match(T__2);
				}
				break;
			case T__5:
				_localctx = new TableOperationSumLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__5);
				setState(85);
				expr(0);
				setState(86);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
	 
		public DivContext() { }
		public void copyFrom(DivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableOperationDivCollContext extends DivContext {
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public TableOperationDivCollContext(DivContext ctx) { copyFrom(ctx); }
	}
	public static class TableOperationDivLineContext extends DivContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TableOperationDivLineContext(DivContext ctx) { copyFrom(ctx); }
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_div);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new TableOperationDivCollContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(T__6);
				setState(91);
				match(STRING);
				setState(92);
				match(T__2);
				}
				break;
			case T__7:
				_localctx = new TableOperationDivLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__7);
				setState(94);
				expr(0);
				setState(95);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MullContext extends ParserRuleContext {
		public MullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mull; }
	 
		public MullContext() { }
		public void copyFrom(MullContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableOperationMullCollContext extends MullContext {
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public TableOperationMullCollContext(MullContext ctx) { copyFrom(ctx); }
	}
	public static class TableOperationMullLineContext extends MullContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TableOperationMullLineContext(MullContext ctx) { copyFrom(ctx); }
	}

	public final MullContext mull() throws RecognitionException {
		MullContext _localctx = new MullContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mull);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new TableOperationMullCollContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__8);
				setState(100);
				match(STRING);
				setState(101);
				match(T__2);
				}
				break;
			case T__9:
				_localctx = new TableOperationMullLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__9);
				setState(103);
				expr(0);
				setState(104);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	 
		public AddContext() { }
		public void copyFrom(AddContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddLineStrContext extends AddContext {
		public List<TerminalNode> STRING() { return getTokens(BdexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BdexParser.STRING, i);
		}
		public AddLineStrContext(AddContext ctx) { copyFrom(ctx); }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_add);
		int _la;
		try {
			_localctx = new AddLineStrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__10);
			setState(109);
			match(T__11);
			setState(110);
			match(STRING);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(111);
				match(T__12);
				setState(112);
				match(STRING);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	 
		public DeleteContext() { }
		public void copyFrom(DeleteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteLineContext extends DeleteContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeleteLineContext(DeleteContext ctx) { copyFrom(ctx); }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_delete);
		try {
			_localctx = new DeleteLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__13);
			setState(121);
			expr(0);
			setState(122);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractionContext extends ParserRuleContext {
		public ExtractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraction; }
	 
		public ExtractionContext() { }
		public void copyFrom(ExtractionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExtractVARNAMEContext extends ExtractionContext {
		public TerminalNode VARNAME() { return getToken(BdexParser.VARNAME, 0); }
		public ExtractVARNAMEContext(ExtractionContext ctx) { copyFrom(ctx); }
	}
	public static class ExtractVARNAMEStringContext extends ExtractionContext {
		public TerminalNode VARNAME() { return getToken(BdexParser.VARNAME, 0); }
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public ExtractVARNAMEStringContext(ExtractionContext ctx) { copyFrom(ctx); }
	}

	public final ExtractionContext extraction() throws RecognitionException {
		ExtractionContext _localctx = new ExtractionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_extraction);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ExtractVARNAMEStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__14);
				setState(125);
				match(VARNAME);
				setState(126);
				match(T__12);
				setState(127);
				match(STRING);
				setState(128);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new ExtractVARNAMEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__14);
				setState(130);
				match(VARNAME);
				setState(131);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	 
		public CreateTableContext() { }
		public void copyFrom(CreateTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreatTABLEContext extends CreateTableContext {
		public TerminalNode VARNAME() { return getToken(BdexParser.VARNAME, 0); }
		public List<TerminalNode> STRING() { return getTokens(BdexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BdexParser.STRING, i);
		}
		public CreatTABLEContext(CreateTableContext ctx) { copyFrom(ctx); }
	}
	public static class CreatTableJunctionContext extends CreateTableContext {
		public TerminalNode VARNAME() { return getToken(BdexParser.VARNAME, 0); }
		public JunctionContext junction() {
			return getRuleContext(JunctionContext.class,0);
		}
		public CreatTableJunctionContext(CreateTableContext ctx) { copyFrom(ctx); }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createTable);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new CreatTABLEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__15);
				setState(135);
				match(VARNAME);
				setState(136);
				match(T__16);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(137);
					match(STRING);
					}
				}

				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(140);
					match(T__12);
					setState(141);
					match(STRING);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new CreatTableJunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__15);
				setState(148);
				match(VARNAME);
				setState(149);
				match(T__16);
				setState(150);
				junction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetValueContext extends ParserRuleContext {
		public SetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setValue; }
	 
		public SetValueContext() { }
		public void copyFrom(SetValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetValueTableContext extends SetValueContext {
		public TerminalNode INT() { return getToken(BdexParser.INT, 0); }
		public TerminalNode VARNAME() { return getToken(BdexParser.VARNAME, 0); }
		public List<TerminalNode> STRING() { return getTokens(BdexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BdexParser.STRING, i);
		}
		public SetValueTableContext(SetValueContext ctx) { copyFrom(ctx); }
	}

	public final SetValueContext setValue() throws RecognitionException {
		SetValueContext _localctx = new SetValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setValue);
		int _la;
		try {
			_localctx = new SetValueTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__17);
			setState(154);
			match(INT);
			setState(155);
			match(T__12);
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__12:
				{
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(156);
					match(T__12);
					setState(157);
					match(STRING);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case VARNAME:
				{
				setState(163);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(166);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JunctionContext extends ParserRuleContext {
		public JunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_junction; }
	 
		public JunctionContext() { }
		public void copyFrom(JunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JuncTableContext extends JunctionContext {
		public List<TerminalNode> VARNAME() { return getTokens(BdexParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(BdexParser.VARNAME, i);
		}
		public JuncTableContext(JunctionContext ctx) { copyFrom(ctx); }
	}

	public final JunctionContext junction() throws RecognitionException {
		JunctionContext _localctx = new JunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_junction);
		try {
			_localctx = new JuncTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__18);
			setState(169);
			match(VARNAME);
			setState(170);
			match(T__12);
			setState(171);
			match(VARNAME);
			setState(172);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	 
		public ReadContext() { }
		public void copyFrom(ReadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadCollContext extends ReadContext {
		public Token CollName;
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public ReadCollContext(ReadContext ctx) { copyFrom(ctx); }
	}
	public static class ReadLineContext extends ReadContext {
		public ExprContext LineIndex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReadLineContext(ReadContext ctx) { copyFrom(ctx); }
	}
	public static class ReadSTRContext extends ReadContext {
		public Token CollName;
		public ExprContext LineIndex;
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReadSTRContext(ReadContext ctx) { copyFrom(ctx); }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_read);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new ReadCollContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__19);
				setState(175);
				((ReadCollContext)_localctx).CollName = match(STRING);
				setState(176);
				match(T__2);
				}
				break;
			case T__20:
				_localctx = new ReadLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(T__20);
				setState(178);
				((ReadLineContext)_localctx).LineIndex = expr(0);
				setState(179);
				match(T__2);
				}
				break;
			case T__21:
				_localctx = new ReadSTRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(T__21);
				setState(182);
				((ReadSTRContext)_localctx).CollName = match(STRING);
				setState(183);
				match(T__12);
				setState(184);
				((ReadSTRContext)_localctx).LineIndex = expr(0);
				setState(185);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintLineContext extends PrintContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public PrintLineContext(PrintContext ctx) { copyFrom(ctx); }
	}
	public static class PrintCollContext extends PrintContext {
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintCollContext(PrintContext ctx) { copyFrom(ctx); }
	}
	public static class PrintStrContext extends PrintContext {
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public PrintStrContext(PrintContext ctx) { copyFrom(ctx); }
	}
	public static class PrintEXPRContext extends PrintContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintEXPRContext(PrintContext ctx) { copyFrom(ctx); }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new PrintCollContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(T__22);
				setState(190);
				match(STRING);
				setState(191);
				match(T__12);
				setState(192);
				expr(0);
				setState(193);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new PrintLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(T__23);
				setState(196);
				expr(0);
				setState(197);
				match(T__12);
				setState(198);
				match(STRING);
				setState(199);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(T__24);
				setState(202);
				match(STRING);
				setState(203);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new PrintEXPRContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(T__24);
				setState(205);
				expr(0);
				setState(206);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationContext extends ParserRuleContext {
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
	 
		public IterationContext() { }
		public void copyFrom(IterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IterationTableCollumnLineContext extends IterationContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IterationTableCollumnLineContext(IterationContext ctx) { copyFrom(ctx); }
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iteration);
		try {
			_localctx = new IterationTableCollumnLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__25);
			setState(211);
			expr(0);
			setState(212);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForOperationContext extends ParserRuleContext {
		public ForConditionsContext forConditions() {
			return getRuleContext(ForConditionsContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public ForOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forOperation; }
	}

	public final ForOperationContext forOperation() throws RecognitionException {
		ForOperationContext _localctx = new ForOperationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forOperation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__26);
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(215);
				match(T__11);
				}
				break;
			}
			setState(218);
			forConditions();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(219);
				match(T__2);
				}
			}

			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					operation();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionsContext extends ParserRuleContext {
		public ExprContext iterator;
		public Token startExpr;
		public Token range;
		public Token endExpr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(BdexParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(BdexParser.INT, i);
		}
		public ForConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditions; }
	}

	public final ForConditionsContext forConditions() throws RecognitionException {
		ForConditionsContext _localctx = new ForConditionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forConditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			((ForConditionsContext)_localctx).iterator = expr(0);
			setState(229);
			match(T__27);
			setState(230);
			((ForConditionsContext)_localctx).startExpr = match(INT);
			setState(231);
			((ForConditionsContext)_localctx).range = match(T__28);
			setState(232);
			((ForConditionsContext)_localctx).endExpr = match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprDoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(BdexParser.DOUBLE, 0); }
		public ExprDoubleContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIterationWhenContext extends ExprContext {
		public Token op;
		public List<TerminalNode> STRING() { return getTokens(BdexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BdexParser.STRING, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(BdexParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(BdexParser.DOUBLE, i);
		}
		public ExprIterationWhenContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIntegerContext extends ExprContext {
		public TerminalNode INT() { return getToken(BdexParser.INT, 0); }
		public ExprIntegerContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMultDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParentContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVarContext extends ExprContext {
		public TerminalNode VARNAME() { return getToken(BdexParser.VARNAME, 0); }
		public ExprVarContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				_localctx = new ExprIterationWhenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(235);
				match(STRING);
				setState(236);
				((ExprIterationWhenContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
					((ExprIterationWhenContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				match(DOUBLE);
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(238);
						match(T__38);
						setState(239);
						match(STRING);
						setState(240);
						((ExprIterationWhenContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
							((ExprIterationWhenContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						match(DOUBLE);
						}
						} 
					}
					setState(246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case INT:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(INT);
				}
				break;
			case T__11:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(T__11);
				setState(249);
				expr(0);
				setState(250);
				match(T__2);
				}
				break;
			case DOUBLE:
				{
				_localctx = new ExprDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(DOUBLE);
				}
				break;
			case VARNAME:
				{
				_localctx = new ExprVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(257);
						((ExprMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((ExprMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(258);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(260);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(261);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewVarNameContext extends ParserRuleContext {
		public NewVarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newVarName; }
	 
		public NewVarNameContext() { }
		public void copyFrom(NewVarNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewVarNameDoubleContext extends NewVarNameContext {
		public TerminalNode VARNAME() { return getToken(BdexParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewVarNameDoubleContext(NewVarNameContext ctx) { copyFrom(ctx); }
	}
	public static class NewVarNameStringContext extends NewVarNameContext {
		public TerminalNode VARNAME() { return getToken(BdexParser.VARNAME, 0); }
		public TerminalNode STRING() { return getToken(BdexParser.STRING, 0); }
		public NewVarNameStringContext(NewVarNameContext ctx) { copyFrom(ctx); }
	}
	public static class NewVarNameArrayContext extends NewVarNameContext {
		public TerminalNode VARNAME() { return getToken(BdexParser.VARNAME, 0); }
		public List<TerminalNode> STRING() { return getTokens(BdexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BdexParser.STRING, i);
		}
		public NewVarNameArrayContext(NewVarNameContext ctx) { copyFrom(ctx); }
	}
	public static class NewVarNameVarContext extends NewVarNameContext {
		public List<TerminalNode> VARNAME() { return getTokens(BdexParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(BdexParser.VARNAME, i);
		}
		public NewVarNameVarContext(NewVarNameContext ctx) { copyFrom(ctx); }
	}

	public final NewVarNameContext newVarName() throws RecognitionException {
		NewVarNameContext _localctx = new NewVarNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newVarName);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				_localctx = new NewVarNameDoubleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__39);
				setState(268);
				match(VARNAME);
				setState(269);
				match(T__16);
				setState(270);
				expr(0);
				}
				break;
			case T__40:
				_localctx = new NewVarNameStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(T__40);
				setState(272);
				match(VARNAME);
				setState(273);
				match(T__16);
				setState(274);
				match(STRING);
				}
				break;
			case T__41:
				_localctx = new NewVarNameArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(T__41);
				setState(276);
				match(VARNAME);
				setState(277);
				match(T__16);
				setState(278);
				match(T__42);
				setState(279);
				match(STRING);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(280);
					match(T__12);
					setState(281);
					match(STRING);
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(287);
				match(T__43);
				}
				break;
			case T__44:
				_localctx = new NewVarNameVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(T__44);
				setState(289);
				match(VARNAME);
				setState(290);
				match(T__16);
				setState(291);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0129\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7d\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\3\t\7\tt\n\t\f\t\16"+
		"\tw\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0087\n\13\3\f\3\f\3\f\3\f\5\f\u008d\n\f\3\f\3\f\7\f\u0091\n"+
		"\f\f\f\16\f\u0094\13\f\3\f\3\f\3\f\3\f\5\f\u009a\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00a1\n\r\f\r\16\r\u00a4\13\r\3\r\5\r\u00a7\n\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00be\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d3"+
		"\n\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00db\n\22\3\22\3\22\5\22\u00df"+
		"\n\22\3\22\7\22\u00e2\n\22\f\22\16\22\u00e5\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f5\n\24\f\24"+
		"\16\24\u00f8\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0101\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0109\n\24\f\24\16\24\u010c\13\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u011d\n\25\f\25\16\25\u0120\13\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0127\n\25\3\25\2\3&\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(\2\5\4\2\23\23$(\3\2 !\3\2\"#\2\u0143\2-\3\2\2\2\4<\3\2\2\2\6H\3"+
		"\2\2\2\bQ\3\2\2\2\nZ\3\2\2\2\fc\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22z\3"+
		"\2\2\2\24\u0086\3\2\2\2\26\u0099\3\2\2\2\30\u009b\3\2\2\2\32\u00aa\3\2"+
		"\2\2\34\u00bd\3\2\2\2\36\u00d2\3\2\2\2 \u00d4\3\2\2\2\"\u00d8\3\2\2\2"+
		"$\u00e6\3\2\2\2&\u0100\3\2\2\2(\u0126\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3"+
		"\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\2\2\3\61\3\3"+
		"\2\2\2\62\63\7\60\2\2\63\64\7\3\2\2\64=\5\6\4\2\65=\5\26\f\2\66=\5\32"+
		"\16\2\67=\5\34\17\28=\5\36\20\29=\5 \21\2:=\5\"\22\2;=\5(\25\2<\62\3\2"+
		"\2\2<\65\3\2\2\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2"+
		"<;\3\2\2\2=\5\3\2\2\2>I\3\2\2\2?I\5\22\n\2@I\5\b\5\2AI\5\20\t\2BI\5\n"+
		"\6\2CI\5\f\7\2DI\5\16\b\2EI\5 \21\2FI\5\30\r\2GI\5\24\13\2H>\3\2\2\2H"+
		"?\3\2\2\2H@\3\2\2\2HA\3\2\2\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2\2HE\3\2\2\2"+
		"HF\3\2\2\2HG\3\2\2\2I\7\3\2\2\2JK\7\4\2\2KL\7\61\2\2LR\7\5\2\2MN\7\6\2"+
		"\2NO\5&\24\2OP\7\5\2\2PR\3\2\2\2QJ\3\2\2\2QM\3\2\2\2R\t\3\2\2\2ST\7\7"+
		"\2\2TU\7\61\2\2U[\7\5\2\2VW\7\b\2\2WX\5&\24\2XY\7\5\2\2Y[\3\2\2\2ZS\3"+
		"\2\2\2ZV\3\2\2\2[\13\3\2\2\2\\]\7\t\2\2]^\7\61\2\2^d\7\5\2\2_`\7\n\2\2"+
		"`a\5&\24\2ab\7\5\2\2bd\3\2\2\2c\\\3\2\2\2c_\3\2\2\2d\r\3\2\2\2ef\7\13"+
		"\2\2fg\7\61\2\2gm\7\5\2\2hi\7\f\2\2ij\5&\24\2jk\7\5\2\2km\3\2\2\2le\3"+
		"\2\2\2lh\3\2\2\2m\17\3\2\2\2no\7\r\2\2op\7\16\2\2pu\7\61\2\2qr\7\17\2"+
		"\2rt\7\61\2\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2"+
		"\2\2xy\7\5\2\2y\21\3\2\2\2z{\7\20\2\2{|\5&\24\2|}\7\5\2\2}\23\3\2\2\2"+
		"~\177\7\21\2\2\177\u0080\7\60\2\2\u0080\u0081\7\17\2\2\u0081\u0082\7\61"+
		"\2\2\u0082\u0087\7\5\2\2\u0083\u0084\7\21\2\2\u0084\u0085\7\60\2\2\u0085"+
		"\u0087\7\5\2\2\u0086~\3\2\2\2\u0086\u0083\3\2\2\2\u0087\25\3\2\2\2\u0088"+
		"\u0089\7\22\2\2\u0089\u008a\7\60\2\2\u008a\u008c\7\23\2\2\u008b\u008d"+
		"\7\61\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0092\3\2\2\2"+
		"\u008e\u008f\7\17\2\2\u008f\u0091\7\61\2\2\u0090\u008e\3\2\2\2\u0091\u0094"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009a\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7\22\2\2\u0096\u0097\7\60\2\2\u0097\u0098\7"+
		"\23\2\2\u0098\u009a\5\32\16\2\u0099\u0088\3\2\2\2\u0099\u0095\3\2\2\2"+
		"\u009a\27\3\2\2\2\u009b\u009c\7\24\2\2\u009c\u009d\7\62\2\2\u009d\u00a6"+
		"\7\17\2\2\u009e\u009f\7\17\2\2\u009f\u00a1\7\61\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a7"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\7\60\2\2\u00a6\u00a2\3\2\2\2"+
		"\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\5\2\2\u00a9\31"+
		"\3\2\2\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\7\60\2\2\u00ac\u00ad\7\17\2"+
		"\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\7\5\2\2\u00af\33\3\2\2\2\u00b0\u00b1"+
		"\7\26\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00be\7\5\2\2\u00b3\u00b4\7\27\2"+
		"\2\u00b4\u00b5\5&\24\2\u00b5\u00b6\7\5\2\2\u00b6\u00be\3\2\2\2\u00b7\u00b8"+
		"\7\30\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\7\17\2\2\u00ba\u00bb\5&\24"+
		"\2\u00bb\u00bc\7\5\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b0\3\2\2\2\u00bd\u00b3"+
		"\3\2\2\2\u00bd\u00b7\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00c0\7\31\2\2\u00c0"+
		"\u00c1\7\61\2\2\u00c1\u00c2\7\17\2\2\u00c2\u00c3\5&\24\2\u00c3\u00c4\7"+
		"\5\2\2\u00c4\u00d3\3\2\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00c7\5&\24\2\u00c7"+
		"\u00c8\7\17\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00ca\7\5\2\2\u00ca\u00d3\3"+
		"\2\2\2\u00cb\u00cc\7\33\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00d3\7\5\2\2\u00ce"+
		"\u00cf\7\33\2\2\u00cf\u00d0\5&\24\2\u00d0\u00d1\7\5\2\2\u00d1\u00d3\3"+
		"\2\2\2\u00d2\u00bf\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7\34\2\2\u00d5\u00d6\5&\24"+
		"\2\u00d6\u00d7\7\5\2\2\u00d7!\3\2\2\2\u00d8\u00da\7\35\2\2\u00d9\u00db"+
		"\7\16\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00dc\u00de\5$\23\2\u00dd\u00df\7\5\2\2\u00de\u00dd\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\5\4\3\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4#\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5&\24\2\u00e7\u00e8\7\36\2\2\u00e8\u00e9"+
		"\7\62\2\2\u00e9\u00ea\7\37\2\2\u00ea\u00eb\7\62\2\2\u00eb%\3\2\2\2\u00ec"+
		"\u00ed\b\24\1\2\u00ed\u00ee\7\61\2\2\u00ee\u00ef\t\2\2\2\u00ef\u00f6\7"+
		"\63\2\2\u00f0\u00f1\7)\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\t\2\2\2\u00f3"+
		"\u00f5\7\63\2\2\u00f4\u00f0\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u0101\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u0101\7\62\2\2\u00fa\u00fb\7\16\2\2\u00fb\u00fc\5&\24\2\u00fc\u00fd\7"+
		"\5\2\2\u00fd\u0101\3\2\2\2\u00fe\u0101\7\63\2\2\u00ff\u0101\7\60\2\2\u0100"+
		"\u00ec\3\2\2\2\u0100\u00f9\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u00ff\3\2\2\2\u0101\u010a\3\2\2\2\u0102\u0103\f\t\2\2\u0103"+
		"\u0104\t\3\2\2\u0104\u0109\5&\24\n\u0105\u0106\f\b\2\2\u0106\u0107\t\4"+
		"\2\2\u0107\u0109\5&\24\t\u0108\u0102\3\2\2\2\u0108\u0105\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\'\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010d\u010e\7*\2\2\u010e\u010f\7\60\2\2\u010f\u0110"+
		"\7\23\2\2\u0110\u0127\5&\24\2\u0111\u0112\7+\2\2\u0112\u0113\7\60\2\2"+
		"\u0113\u0114\7\23\2\2\u0114\u0127\7\61\2\2\u0115\u0116\7,\2\2\u0116\u0117"+
		"\7\60\2\2\u0117\u0118\7\23\2\2\u0118\u0119\7-\2\2\u0119\u011e\7\61\2\2"+
		"\u011a\u011b\7\17\2\2\u011b\u011d\7\61\2\2\u011c\u011a\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0127\7.\2\2\u0122\u0123\7/\2\2\u0123\u0124\7\60"+
		"\2\2\u0124\u0125\7\23\2\2\u0125\u0127\7\60\2\2\u0126\u010d\3\2\2\2\u0126"+
		"\u0111\3\2\2\2\u0126\u0115\3\2\2\2\u0126\u0122\3\2\2\2\u0127)\3\2\2\2"+
		"\33-<HQZclu\u0086\u008c\u0092\u0099\u00a2\u00a6\u00bd\u00d2\u00da\u00de"+
		"\u00e3\u00f6\u0100\u0108\u010a\u011e\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}