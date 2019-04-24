package me.jackson.fruition.feature;

/**
 * A feature is an object that can be used for virtually anything.
 *
 * <p>
 * Said object is similar to the "module" design.
 * However, the main goal is to only be categorized by label.
 * </p>
 *
 * @author Jax
 * Created in Apr 2019
 */
public interface Feature {

    /**
     * Initialization function present for all features.
     */
    void init();

    /**
     * @return The feature's name.
     */
    String getName();
}
