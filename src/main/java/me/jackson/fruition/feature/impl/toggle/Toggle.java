package me.jackson.fruition.feature.impl.toggle;

/**
 * Allows a feature to be toggleable.
 *
 * <p>
 * This interface can also be utilized for other classes.
 * </p>
 *
 * @author Jax
 * Created in Apr 2019
 */
public interface Toggle {

    /**
     * Changes the state of the feature / object to the opposite.
     */
    void toggle();
}
