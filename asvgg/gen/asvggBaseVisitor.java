// Generated from C:/Users/Vinicius/Desktop/asvgg\asvgg.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link asvggVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class asvggBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements asvggVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariavel(asvggParser.VariavelContext ctx) { return visitChildren(ctx); }
}