/* The following code was generated by JFlex 1.4.3 on 7/21/15 1:05 PM */

package org.intellij.plugins.hcl;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import java.util.EnumSet;
import static org.intellij.plugins.hcl.HCLElementTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 7/21/15 1:05 PM from the specification file
 * <tt>/Users/vlad/devel/idea-plugins/intellij-hcl/src/org/intellij/plugins/hcl/HCLLexer.flex</tt>
 */
public class _HCLLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int D_STRING = 2;
  public static final int TIL_EXPRESSION = 6;
  public static final int YYINITIAL = 0;
  public static final int IN_NUMBER = 8;
  public static final int S_STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\0\1\22"+
    "\1\5\1\17\2\0\1\24\1\42\1\0\1\6\1\15\1\27\1\7"+
    "\1\13\1\4\1\10\11\12\3\0\1\30\3\0\4\16\1\14\1\16"+
    "\1\43\3\16\1\43\1\16\1\43\15\16\1\25\1\23\1\26\1\0"+
    "\1\16\1\0\1\36\1\44\2\16\1\34\1\35\1\43\3\16\1\43"+
    "\1\37\1\43\1\41\3\16\1\32\1\40\1\31\1\33\2\16\1\11"+
    "\2\16\1\20\1\0\1\21\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\3\1\1\0\1\2\1\3\1\2\1\4\1\5"+
    "\1\6\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\3\5\3\1\1\17\3\1\1\20"+
    "\1\1\1\2\1\21\1\22\1\1\1\0\2\23\1\24"+
    "\2\6\3\0\3\5\1\25\1\26\3\0\1\23\1\24"+
    "\3\5\1\6\1\0\1\6\3\5\1\23\1\0\2\23"+
    "\1\24\1\6\1\5\1\6\1\27\1\5\1\30\1\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[77];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\271\0\271\0\271"+
    "\0\271\0\271\0\271\0\271\0\271\0\u01e1\0\u0206\0\u022b"+
    "\0\u0250\0\u0275\0\271\0\271\0\u029a\0\u02bf\0\u02e4\0\271"+
    "\0\u0309\0\u032e\0\271\0\271\0\u0353\0\u0378\0\u039d\0\u03c2"+
    "\0\u03e7\0\u040c\0\u0431\0\u0456\0\u047b\0\u04a0\0\u04c5\0\u04ea"+
    "\0\u050f\0\271\0\271\0\u0534\0\u0559\0\u057e\0\u05a3\0\u05c8"+
    "\0\u05ed\0\u0612\0\u0637\0\u065c\0\u0681\0\u0681\0\u06a6\0\u06cb"+
    "\0\u06f0\0\u0715\0\u073a\0\u075f\0\271\0\271\0\u0784\0\u07a9"+
    "\0\u07a9\0\u0197\0\u07ce\0\u0197\0\u0197";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[77];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\3\7\1\10\1\11\1\6\1\12\1\13\1\14"+
    "\1\15\2\14\1\6\1\14\1\6\1\16\1\17\1\20"+
    "\1\6\1\21\1\22\1\23\1\24\1\25\1\26\3\14"+
    "\1\27\3\14\1\30\1\6\2\14\1\31\2\6\14\31"+
    "\1\32\2\33\1\34\1\35\21\31\1\36\2\6\14\36"+
    "\1\32\2\33\1\36\1\37\1\40\20\36\1\41\2\6"+
    "\14\41\1\42\1\6\1\43\1\44\1\45\1\44\20\41"+
    "\7\0\1\46\1\47\1\0\1\50\100\0\3\7\45\0"+
    "\1\11\1\0\1\51\36\0\2\11\1\0\42\11\7\0"+
    "\1\14\1\52\1\14\1\53\2\14\1\0\1\14\12\0"+
    "\11\14\1\0\2\14\10\0\1\15\1\54\1\15\1\55"+
    "\1\56\17\0\1\56\17\0\6\14\1\0\1\14\12\0"+
    "\11\14\1\0\2\14\10\0\1\15\1\0\1\15\1\55"+
    "\1\56\17\0\1\56\17\0\6\14\1\0\1\14\12\0"+
    "\1\14\1\57\7\14\1\0\2\14\7\0\6\14\1\0"+
    "\1\14\12\0\5\14\1\60\3\14\1\0\2\14\7\0"+
    "\6\14\1\0\1\14\12\0\2\14\1\61\6\14\1\0"+
    "\2\14\1\31\2\0\14\31\4\0\1\35\21\31\20\0"+
    "\1\62\24\0\1\31\2\0\20\31\1\35\21\31\1\36"+
    "\2\0\14\36\3\0\1\36\1\37\1\0\21\36\2\0"+
    "\20\36\1\37\21\36\1\41\2\0\14\41\4\0\1\45"+
    "\1\0\20\41\20\0\1\63\24\0\1\41\2\0\20\41"+
    "\1\45\21\41\10\0\1\47\1\0\1\50\42\0\1\50"+
    "\1\64\1\50\1\65\1\66\17\0\1\66\5\0\2\67"+
    "\11\0\1\50\1\0\1\50\1\65\1\66\17\0\1\66"+
    "\5\0\2\67\1\0\6\51\1\70\36\51\7\0\1\14"+
    "\1\53\1\71\1\53\1\72\1\73\1\0\1\14\12\0"+
    "\3\14\1\73\5\14\1\0\2\14\7\0\1\14\1\53"+
    "\1\14\1\53\1\72\1\73\1\0\1\14\12\0\3\14"+
    "\1\73\5\14\1\0\2\14\10\0\1\15\1\0\1\15"+
    "\42\0\1\74\1\0\1\74\41\0\1\75\1\76\1\0"+
    "\1\76\2\0\1\75\36\0\6\14\1\0\1\14\12\0"+
    "\2\14\1\77\6\14\1\0\2\14\7\0\6\14\1\0"+
    "\1\14\12\0\6\14\1\100\2\14\1\0\2\14\7\0"+
    "\6\14\1\0\1\14\12\0\6\14\1\101\2\14\1\0"+
    "\2\14\10\0\1\50\1\0\1\50\42\0\1\102\1\0"+
    "\1\102\41\0\1\103\1\104\1\0\1\104\2\0\1\103"+
    "\73\0\1\105\4\51\1\106\40\51\7\0\1\14\1\53"+
    "\1\14\1\53\2\14\1\0\1\14\12\0\11\14\1\0"+
    "\2\14\7\0\1\14\1\107\1\14\1\107\2\14\1\0"+
    "\1\14\12\0\11\14\1\0\2\14\7\0\1\110\1\111"+
    "\1\14\1\111\2\14\1\75\1\14\12\0\11\14\1\0"+
    "\2\14\10\0\1\74\1\0\1\74\1\0\1\56\17\0"+
    "\1\56\20\0\1\76\1\0\1\76\41\0\6\14\1\0"+
    "\1\14\12\0\3\14\1\112\5\14\1\0\2\14\7\0"+
    "\6\14\1\0\1\14\12\0\7\14\1\113\1\14\1\0"+
    "\2\14\7\0\6\14\1\0\1\14\12\0\6\14\1\114"+
    "\2\14\1\0\2\14\10\0\1\102\1\0\1\102\1\0"+
    "\1\66\17\0\1\66\5\0\2\67\11\0\1\104\1\0"+
    "\1\104\42\0\1\104\1\0\1\104\27\0\2\67\10\0"+
    "\1\14\1\107\1\14\1\107\1\14\1\73\1\0\1\14"+
    "\12\0\3\14\1\73\5\14\1\0\2\14\7\0\1\14"+
    "\1\111\1\14\1\111\2\14\1\0\1\14\12\0\11\14"+
    "\1\0\2\14\7\0\6\14\1\0\1\14\12\0\3\14"+
    "\1\115\5\14\1\0\2\14";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2035];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\3\1\1\0\1\11\7\1\10\11\5\1\2\11"+
    "\3\1\1\11\2\1\2\11\1\1\1\0\5\1\3\0"+
    "\3\1\2\11\3\0\6\1\1\0\5\1\1\0\1\1"+
    "\2\11\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[77];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
    private boolean withNumbersWithBytesPostfix;
    private boolean withInterpolationLanguage;

    public _HCLLexer(EnumSet<HCLCapability> capabilities) {
      this((java.io.Reader)null);
      this.withNumbersWithBytesPostfix = capabilities.contains(HCLCapability.NUMBERS_WITH_BYTES_POSTFIX);
      this.withInterpolationLanguage = capabilities.contains(HCLCapability.INTERPOLATION_LANGUAGE);
    }
    enum StringType {
      None, SingleQ, DoubleQ
    }
    // TODO: Store all state variables in zzLexicalState
    // TODO: Optionally disable IL detection
    StringType stringType = StringType.None;
    int stringStart = -1;
    int til = 0;

    private void til_inc() {
      til++;
    }
    private int til_dec() {
      til--;
      return til;
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _HCLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 22: 
          { assert stringType != StringType.None : "Not expected"; til_inc();
          }
        case 26: break;
        case 13: 
          { return COMMA;
          }
        case 27: break;
        case 17: 
          { assert stringType != StringType.None : "Not expected"; if (til_dec() <= 0) yybegin(stringType == StringType.SingleQ ? S_STRING: D_STRING);
          }
        case 28: break;
        case 24: 
          { return NULL;
          }
        case 29: break;
        case 19: 
          { yybegin(YYINITIAL); return NUMBER;
          }
        case 30: break;
        case 4: 
          { return LINE_COMMENT;
          }
        case 31: break;
        case 9: 
          { stringType = StringType.DoubleQ; stringStart = zzStartRead; yybegin(D_STRING);
          }
        case 32: break;
        case 2:
          { return BAD_CHARACTER;
          }
        case 33: break;
        case 8: 
          { return R_CURLY;
          }
        case 34: break;
        case 25: 
          { return FALSE;
          }
        case 35: break;
        case 12: 
          { return R_BRACKET;
          }
        case 36: break;
        case 14: 
          { return EQUALS;
          }
        case 37: break;
        case 11: 
          { return L_BRACKET;
          }
        case 38: break;
        case 21: 
          { til_inc(); yybegin(TIL_EXPRESSION);
          }
        case 39: break;
        case 20: 
          { return BLOCK_COMMENT;
          }
        case 40: break;
        case 5: 
          { return ID;
          }
        case 41: break;
        case 6: 
          { if (!withNumbersWithBytesPostfix) return NUMBER;
                                yybegin(IN_NUMBER); yypushback(yylength());
          }
        case 42: break;
        case 1: 
          { ;
          }
        case 43: break;
        case 16: 
          { yybegin(YYINITIAL); assert til == 0;stringType = StringType.None; zzStartRead = stringStart; return SINGLE_QUOTED_STRING;
          }
        case 44: break;
        case 7: 
          { return L_CURLY;
          }
        case 45: break;
        case 10: 
          { stringType = StringType.SingleQ; stringStart = zzStartRead; yybegin(S_STRING);
          }
        case 46: break;
        case 23: 
          { return TRUE;
          }
        case 47: break;
        case 3: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 48: break;
        case 18: 
          { 
          }
        case 49: break;
        case 15: 
          { yybegin(YYINITIAL); assert til == 0;stringType = StringType.None; zzStartRead = stringStart; return DOUBLE_QUOTED_STRING;
          }
        case 50: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
