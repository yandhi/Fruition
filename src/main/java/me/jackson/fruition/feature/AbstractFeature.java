package me.jackson.fruition.feature;

/**
 * The abstracted form of {@link Feature}.
 *
 * <p>
 * When utilizing this API, please use this for your various implementations.
 * </p>
 *
 * @author Jax
 * Created in Apr 2019
 */
public abstract class AbstractFeature implements Feature {

    /**
     * The feature's name.
     *
     * <p>
     * Preferably, this would not include spaces for simplicity.
     * However, if deemed necessary, simply when searching for said module through {@link String} add the space.
     * </p>
     */
    private final String name;

    public AbstractFeature(String name) {
        this.name = name;
    }

    /**
     * Override this function so that child classes will not be forced to implement the initialization function.
     *
     * <p>
     * Without doing this, the function will be rendered more annoying than useful.
     * </p>
     */
    @Override
    public void init() {
    }

    @Override
    public String getName() {
        return name;
    }
}
